/*
SID Number: 2031320.
Team name: M&M
  */

public class Main {
    public static void main(String[] args) {
        Login mainObj1 = new Login();
        Menu mainObj2 = new Menu();

        System.out.println(" ______________ ");
        System.out.println("|   REDGATE    | ");
        System.out.println(" -------------- ");
        System.out.println(" FEEL GOOD FUND ");
        System.out.println();

        mainObj1.loginCredentials(); //Verifies entered Username and Password.
        mainObj2.menuItems();        //Displays MENU options.
        mainObj2.menuChoice();       //Enables user to choose and enter an option.


    }
}
