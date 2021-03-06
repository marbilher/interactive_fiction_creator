import java.util.HashMap;
import java.util.Scanner;

public class PlayControl {

    Scanner sc = new Scanner(System.in);
    private static PlayControl single_instance = null;
    private Coordinates currentLocation;
    private String descriptionText;
    private HashMap<String, Coordinates> availableDirections;
    private String choice;

    public String s;

    private PlayControl() {
        s = "I control Play";
    }

    public static PlayControl getInstance() {
        if (single_instance == null)
            single_instance = new PlayControl();

        return single_instance;
    }
    //Play control needs to display description, display available actions, accept input and update player pos / map
    // method to handle these
    // also method to get available directions

    public void managePlayOptions() {

        Object mySavedGameState = GameStateFileStore.ReadObjectFromFile("GameState.ser");
        GameState castedGameState = GameState.class.cast(mySavedGameState);
        currentLocation = castedGameState.getSavedPlayerLocation();
        LocationData[][] storedGameStateMap = castedGameState.getMapState();
        descriptionText = storedGameStateMap[currentLocation.x][currentLocation.y].getDescriptionText();
        System.out.println(descriptionText);

        AvailableMovements myMoveSet = new AvailableMovements(currentLocation, storedGameStateMap);
        myMoveSet.printStringDirections();
        availableDirections = myMoveSet.getDirectionalMap();
        choice = sc.nextLine();
        if (availableDirections.containsKey(choice)) {
            currentLocation = availableDirections.get(choice);  //refactor this into walkToNewLocation
            castedGameState.setSavedPlayerLocation(currentLocation);
            GameStateFileStore.WriteObjectToFile(castedGameState);
            managePlayOptions();
        } else {
            System.out.println("Invalid option");
            managePlayOptions();
        }

    }

//    public Coordinates getPlayerLocation() {
//
//    }

//    public void displayMovements(Coordinates currentCoords, LocationData[][] currentMap) {
//        AvailableMovements myMoveSet = new AvailableMovements(currentCoords, currentMap);
//    }

    public void readDescription(LocationData currentLocation) {

    }

    public void updatePlayerLocation() {
        //requires new property on gamestate object
        //
    }

    public void handleMovement() {

    }

}
