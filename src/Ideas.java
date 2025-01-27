import java.io.File;         //Import the File class
import java.io.FileReader;   //Import the FilReader class
import java.io.FileWriter;   //Import the FileWriter class
import java.io.IOException;  //Import the IOException class to handle errors
import java.util.Scanner;

public class Ideas {
    public void createIdeaFile() {
        try {
            File newFile = new File("ideas.txt"); //Creates file "ideas.txt"
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
        String input;
        Scanner ideaInput = new Scanner(System.in);
        try {
            //Writing/appending user input to file "ideas.txt"
            FileWriter existingFile = new FileWriter("ideas.txt", true);
            System.out.println("Drop a suggestion.");
            System.out.print(":");
            input = ideaInput.nextLine();
            existingFile.write(input + "\n");
            existingFile.close();
            System.out.println("Successfully added suggestion.");
        } catch (IOException e) {
            System.out.println("An error occurred. Please try again.");
            e.printStackTrace();
        }
    }

    public void displayIdeas() {
        try {
            //Displaying items contained in file "ideas.txt"
            FileReader fr = new FileReader("ideas.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred. Please try again");
            e.printStackTrace();
        }
    }

    //Method allIdeas() contains all methods from class Ideas
    //Makes it easier to call all objects
    public void allIdeas() {
        int option;
        Scanner ideaInput = new Scanner(System.in);
        Menu ideasObj1 = new Menu();
        Ideas ideasObj2 = new Ideas();
        System.out.println();
        System.out.println();
        System.out.println("Please choose an option");
        System.out.println("1 - Create file.");
        System.out.println("2 - Add suggestion.");
        System.out.println("3 - Display all suggestions.");
        System.out.println("0 - Exit to main menu.");
        System.out.print(":");
        option = ideaInput.nextInt();
        System.out.println();
        System.out.println();

        switch (option) {
            case 1 -> ideasObj2.createIdeaFile();
            case 2 -> ideasObj2.writeFile();
            case 3 -> ideasObj2.displayIdeas();
            case 0 -> {
                ideasObj1.menuItems();
                ideasObj1.menuChoice();
            }
        }
    }
}




