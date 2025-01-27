import java.util.Scanner;

public class Gallery {
    public void pictures() {
        System.out.println("Welcome to The Redgate Gallery");
        System.out.println("A simple way to share photos, videos & messages across The Redgate family.");

        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println();
        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println();
        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println();
        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" |                |    |                |    |                |");
        System.out.println(" ------------------    ------------------    ------------------ ");
        System.out.println();
        System.out.println();
    }

    public void allGallery() {
        int pick;
        Scanner galleryInput = new Scanner(System.in);
        Menu galleryObj1 = new Menu();
        Gallery galleryObj2 = new Gallery();
        System.out.println();
        System.out.println();
        System.out.println("Please choose an option");
        System.out.println("1 - View pictures.");
        System.out.println("0 - Exit to main menu.");
        System.out.print(":");
        pick = galleryInput.nextInt();
        System.out.println();
        System.out.println();

        switch (pick) {
            case 1 -> galleryObj2.pictures();
            case 0 -> {
                galleryObj1.menuItems();
                galleryObj1.menuChoice();
            }
        }
    }
}


