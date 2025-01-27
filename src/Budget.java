import java.util.Scanner;

public class Budget {
    String budgetChoice;
    int input;
    float totalAmount = 5000f; //Fixed total amount allotted to each team stored in float
    float withdraw;
    Scanner budgetInput = new Scanner(System.in);

    public void balance() {
        Menu budgetObj1 = new Menu();
        System.out.println();
        System.out.println("Please choose an option");
        System.out.println("1 - Withdraw amount/View balance.");
        System.out.println("0 - Exit to main menu.");
        System.out.print(":");
        input = budgetInput.nextInt();
        System.out.println();

        switch (input) {
            case 1 -> {
                System.out.println("BALANCE: " + totalAmount); //Print the balance
                System.out.print("Withdraw amount: ");
                withdraw = budgetInput.nextFloat();
                totalAmount -= withdraw; //Expense deducted from total amount
                budgetChoice = budgetInput.nextLine();
                System.out.println("Withdrawal successful.");
            }
            case 0 -> {
                budgetObj1.menuItems();
                budgetObj1.menuChoice();
            }
        }
    }
}