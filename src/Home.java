import java.io.FileReader;
import java.io.IOException;

public class Home {
    public void latestExpenses() {
        try {
            System.out.println();
            System.out.println("LATEST EXPENSES");
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

    public void upcomingEvents() {
        try {
            System.out.println();
            System.out.println("UPCOMING EVENTS");
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

    public void goToMenu() {
        Menu homeObj1 = new Menu();
        System.out.println();
        System.out.println();
        homeObj1.menuItems();
        homeObj1.menuChoice();
    }

    public void allHome() {
        Home homeObj1 = new Home();
        homeObj1.latestExpenses();
        homeObj1.upcomingEvents();
        homeObj1.goToMenu();
    }


}


