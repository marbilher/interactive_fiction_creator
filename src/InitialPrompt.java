import java.util.Scanner;

public class InitialPrompt {

    public static void promptForType() {
        Scanner sc = new Scanner(System.in);
        String choice = null;
        System.out.println("Welcome to text adventure:");
        System.out.println("(edit) an existing map, (create) a new map or (play)"); //load map, edit map, play map
        choice = sc.nextLine();
        if (choice.equals("edit")) {            //call edit class singleton

            EditControl editGame = EditControl.getInstance();
//            editGame.instantiateInitialMapForEdit();
            editGame.editMapOptions();
        } else if (choice.equals("play")) {     //call play class singleton

            PlayControl newGame = PlayControl.getInstance();
            newGame.managePlayOptions();
        } else if (choice.equals("create")) {     //call play class singleton

            CreateControl newMap = CreateControl.getInstance();
            newMap.instantiateInitialMap();
            System.out.println("New map saved");
            EditControl editGame = EditControl.getInstance();
            editGame.editMapOptions();
        } else {
            System.out.println("Please enter a valid option");
            promptForType();
        }
    }

}
