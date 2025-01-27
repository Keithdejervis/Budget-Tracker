/*Import Scanner class.
Used to capture user input*/

import java.util.Scanner;

public class Login {
    String loginUsername = "redgate";  //Username set to "redgate"
    String loginPassword = "password"; //Password set to "password"
    String username, password;
    Scanner loginInput = new Scanner(System.in); //Create a Scanner object

    //Method to verify Username and Password entered.
    public void loginCredentials() {
        /*
        Code executed if entered username doesn't match the username
        that is set and password doesn't match the password that is set
        */
        while (!loginUsername.equals(username) || !loginPassword.equals(password)) {
            System.out.print("Username: ");
            username = loginInput.nextLine(); //Read user input

            System.out.print("Password: ");
            password = loginInput.nextLine();

            if (!loginUsername.equals(username) || !loginPassword.equals(password)) {
                System.out.println("Invalid login, please try again.");
                System.out.println();
            } else {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Welcome " + username); //Output user input
            }
        }
    }
}


