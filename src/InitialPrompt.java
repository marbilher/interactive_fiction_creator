import java.util.Scanner;

public class InitialPrompt {

    public static void promptForType() {
        Scanner sc = new Scanner(System.in);
        String choice = null;
        System.out.println("Welcome to text adventure:");
        System.out.println("(edit) a map or (play)"); //load map, edit map, play map
        choice = sc.nextLine();
        if (choice.equals("edit")) {            //call edit class singleton

            EditControl editGame = EditControl.getInstance();
            editGame.instantiateInitialMapForEdit();
            editGame.editMapOptions();
        } else if (choice.equals("play")) {     //call play class singleton

            PlayControl newGame = PlayControl.getInstance();
            System.out.println("Name entered : " + newGame.s);
        } else {
            System.out.println("Please enter a valid option");
            promptForType();
        }
    }

}
