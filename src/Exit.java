import java.util.Scanner;

public class Exit {
    int end;
    Scanner exitInput = new Scanner(System.in);

    public void exitProgram() {
        System.out.println();
        System.out.println("Program exit!");
        System.exit(0);
    }

    public void allExit() {
        Menu exitObj2 = new Menu();
        Exit exitObj1 = new Exit();
        System.out.println();
        System.out.println();
        System.out.println("Are you sure you want to exit?");
        System.out.println("1 - Cancel.");
        System.out.println("0 - Exit.");
        System.out.print(":");
        end = exitInput.nextInt();
        System.out.println();

        switch (end) {
            case 1 -> {
                exitObj2.menuItems();
                exitObj2.menuChoice();
            }
            case 0 -> exitObj1.exitProgram();
        }
    }
}
