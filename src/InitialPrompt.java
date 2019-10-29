import java.util.Scanner;

public class InitialPrompt {

    public static void promptForType() {
        Scanner sc = new Scanner(System.in);
        String choice = null;
        System.out.println("Welcome to text adventure:");
        System.out.println("(edit) or (play)");
        choice = sc.nextLine();
        if (choice.equals("edit")) {            //call edit class singleton

            EditControl editGame = EditControl.getInstance();
            System.out.println(editGame.editControlQuery);
            MapGenerator editMapGenerator = new MapGenerator();
            NewMapVisualizer editMap = new NewMapVisualizer(editMapGenerator);
            editMap.DrawMap();
        } else if (choice.equals("play")) {     //call play class singleton

            PlayControl newGame = PlayControl.getInstance();
            System.out.println("Name entered : " + newGame.s);
        } else {
            System.out.println("Please enter a valid option");
            promptForType();
        }
    }

}
