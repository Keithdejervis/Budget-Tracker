import java.util.HashMap; //Import HashMap class
import java.util.Scanner;

public class Teams {
    int input;
    Scanner teamInput = new Scanner(System.in);

    public void team() {
        Menu teamsObj1 = new Menu();
        System.out.println();
        System.out.println();
        System.out.println("Please choose an option");
        System.out.println("1 - View team members.");
        System.out.println("0 - Exit to main menu.");
        System.out.print(":");
        input = teamInput.nextInt();
        System.out.println();

        switch (input) {
            case 1 -> {
                HashMap<String, String> members = new HashMap<>();
                members.put("Manager ", " Josh.H");
                members.put("1) ", " Ali Pratt");
                members.put("2) ", " James Evans");
                members.put("3) ", " Rowling Junior");
                members.put("4) ", " Shawna Johansson");
                System.out.println(members);
            }
            case 0 -> {
                teamsObj1.menuItems();
                teamsObj1.menuChoice();
            }
        }
    }
}
