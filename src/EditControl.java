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
        Object myObject = GameStateFileStore.ReadObjectFromFile("GameState.ser");
        GameState cast = GameState.class.cast(myObject);
        NewMapVisualizer mapVisualize = new NewMapVisualizer(cast.getMapState());
        mapVisualize.drawMap();
    }

    public void saveStateToFile(GameState currentState) {

    }

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
