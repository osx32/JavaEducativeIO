//User class
class User{
    private String userName;
    private String password;

    //Parameterized constructor to create a new users
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password){
        //Check if the username and password match
        if(this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password)){
            // toLowercase converts all the characters to lowercase & .equals checks if two strings match

            System.out.println("Access Granted against the username: " + this.userName + " and password: " + this.password);
        }
        else System.out.println("Invalid Credentials!"); // Else invalid credentials
    }
}

public class Encapsulations {
    public static void main(String[] args){
        User educative = new User("Educative", "12345");

        educative.login("Educative", "12345"); // Grants access because credentials are valid

        educative.login("Educative", "123456"); // Does not grant access because the credentials are invalid

        //educative.login("3456");//Uncommenting this line will give an error
                                        // Fields of User class cannot be accessed now
    }


}
