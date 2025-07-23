public class Human {
    private Brain brain; // Composition

    Human(){
        brain = new Brain(); // Created inside
    }

    void think(){
        brain.think();
    }
}
