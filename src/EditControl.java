public class EditControl {

    private static EditControl single_instance = null;

    public String editControlQuery;
    private LocationData[][] myMap;


    public static EditControl getInstance() {
        if (single_instance == null)
            single_instance = new EditControl();

        return single_instance;
    }


    public void instantiateInitialMapForEdit() {
        MapGenerator mapGen = new MapGenerator();     //creating new map, load logic will change this
        myMap = mapGen.generateMap();
        GameState initialState = new GameState(myMap);
        GameStateFileStore.WriteObjectToFile(initialState);
    }

    public void drawMapToUI() {
        //NewMapVisualizer mapVisualize = new NewMapVisualizer(myMap);
        Object savedGameState = GameStateFileStore.ReadObjectFromFile("GameState.ser");
        GameState castGameState = GameState.class.cast(savedGameState);
        NewMapVisualizer mapVisualize = new NewMapVisualizer(castGameState.getMapState());
        mapVisualize.drawMap();
    }

    public void saveStateToFile(GameState currentState) {

    }

    //edit map options is currently infinitelyWriteMapDescriptions
    //for time being on play, start at 0x0
    //later prompt for items, entities, player spawn, q, etc.
    //on select a pos, choose action for pos
    public void editMapOptions() {
        this.drawMapToUI();
        LocationDescriptionUpdater descriptionUpdater = new LocationDescriptionUpdater();
        Object mySavedGameState = GameStateFileStore.ReadObjectFromFile("GameState.ser");
        GameState castedGameState = GameState.class.cast(mySavedGameState);
        LocationData[][] storedGameStateMap = castedGameState.getMapState();
        LocationData[][] updatedMap = descriptionUpdater.updateDescription(storedGameStateMap);
        castedGameState.setMapState(updatedMap);
        GameStateFileStore.WriteObjectToFile(castedGameState);
        editMapOptions();
    }

}
