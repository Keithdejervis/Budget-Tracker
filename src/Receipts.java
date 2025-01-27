import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Receipts {

    public void createReceiptFile() {
        try {
            File newFile = new File("receipts.txt");
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File " + newFile.getName() + " already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred. Please try again");
            e.printStackTrace();
        }
    }

    public void writeFile() {
        //User inputs name of the activity + cost
        //Input is written/appended to file "receipts.txt"
        String input;
        Scanner ideaInput = new Scanner(System.in);
        try {
            FileWriter existingFile = new FileWriter("receipts.txt", true);
            System.out.println("Enter name of activity along with its cost");
            System.out.print(":");
            input = ideaInput.nextLine();
            existingFile.write(input + "\n");
            existingFile.close();
            System.out.println("Successfully added.");
        } catch (IOException e) {
            System.out.println("An error occurred. Please try again.");
            e.printStackTrace();
        }
    }

    public void displayReceipts() {
        try {
            FileReader fr = new FileReader("receipts.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred. Please try again");
            e.printStackTrace();
        }
    }

    public void allReceipts() {
        int option;
        Scanner ideaInput = new Scanner(System.in);
        Menu receiptsObj1 = new Menu();
        Receipts receiptsObj2 = new Receipts();
        System.out.println();
        System.out.println();
        System.out.println("Please choose an option");
        System.out.println("1 - Create file.");
        System.out.println("2 - Add receipts.");
        System.out.println("3 - Display receipts.");
        System.out.println("0 - Exit to main menu.");
        System.out.print(":");
        option = ideaInput.nextInt();
        System.out.println();
        System.out.println();

        switch (option) {
            case 1 -> receiptsObj2.createReceiptFile();
            case 2 -> receiptsObj2.writeFile();
            case 3 -> receiptsObj2.displayReceipts();
            case 0 -> {
                receiptsObj1.menuItems();
                receiptsObj1.menuChoice();
            }
        }
    }
}
