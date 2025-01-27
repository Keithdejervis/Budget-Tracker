import java.util.Objects;
import java.util.Scanner;

public class Menu {
    String userChoice;
    Scanner menuInput = new Scanner(System.in);
    //Objects created are used in the MENU
    Home menuObj1 = new Home();
    Budget menuObj2 = new Budget();
    Ideas menuObj3 = new Ideas();
    Receipts menuObj5 = new Receipts();
    Gallery menuObj6 = new Gallery();
    Teams menuObj7 = new Teams();
    Exit menuObj8 = new Exit();

    public void menuItems() {
        System.out.println("MENU");
        System.out.println("a - Home");     //Displays latest expenses and upcoming events
        System.out.println("b - Budget");   //Allotted budget display and money withdrawal
        System.out.println("c - Ideas");    //User can suggest activity ideas here
        System.out.println("d - Receipts"); //To make a record of all the expenditure
        System.out.println("e - Gallery");
        System.out.println("f - Teams");    //List of team members
        System.out.println("g - Exit");     //Exit program
    }

    public void menuChoice() {
        Menu menuObj9 = new Menu();
        System.out.print(":");
        userChoice = menuInput.nextLine();

        //User input is verified using an if/else statement.
        if (userChoice.equals("a") || userChoice.equals("b") || userChoice.equals("c") || userChoice.equals("d")
                || userChoice.equals("e") || userChoice.equals("f") || userChoice.equals("g") || userChoice.equals("h")) {
            //Code below executed if condition is true
            do {
                switch (userChoice) {
                    case "a" -> menuObj1.allHome();
                    case "b" -> menuObj2.balance();
                    case "c" -> menuObj3.allIdeas();
                    case "d" -> menuObj5.allReceipts();
                    case "e" -> menuObj6.allGallery();
                    case "f" -> menuObj7.team();
                    case "g" -> menuObj8.allExit();
                }
            } while (!Objects.equals(userChoice, "g"));
        } else {
            //Code below executed if condition is false
            System.out.println();
            System.out.println("Invalid input. Please try again.");
            System.out.println();
            menuObj9.menuItems();
            menuObj9.menuChoice();
        }
    }
}

