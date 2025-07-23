public class LivenessExample {
    static class Spoon{
        private Diner owner;

        public Spoon(Diner d){ owner = d;}

        public synchronized void use(){
            System.out.println(owner.name + " is eating...");
        }

        public Diner getOwner(){ return owner;}
        public void setOwner(Diner d){ owner = d;}
    }

    static class Diner{
        private String name;
        private boolean isHungry = true;

        public Diner(String name){this.name = name;}

        public void eatWith(Spoon spoon, Diner partner){
            while(isHungry){
                if(spoon.getOwner() != this){
                    try{ Thread.sleep(1);}
                    catch(Exception e){}
                    continue;
                }

                if(partner.isHungry){
                    System.out.println(name + ": You eat first.");
                    spoon.setOwner(partner);
                    continue;
                }

                spoon.use();
                isHungry = false;
                System.out.println(name + ": I'm done eating.");
                spoon.setOwner(partner);
            }
        }
    }

    public static void main(String[] args){
        Diner alice = new Diner("Alice");
        Diner bob = new Diner("Bob");
        Spoon spoon = new Spoon(alice);

        new Thread(() -> alice.eatWith(spoon, bob)).start();
        new Thread(() -> bob.eatWith(spoon, alice)).start();
    }


}
