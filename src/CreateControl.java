public class CreateControl {

    private static CreateControl single_instance = null;

    private LocationData[][] myMap;

    public static CreateControl getInstance() {
        if (single_instance == null)
            single_instance = new CreateControl();

        return single_instance;
    }

    public void instantiateInitialMap() {
        MapGenerator mapGen = new MapGenerator();     //creating new map, load logic will change this
        myMap = mapGen.generateMap();
        GameState initialState = new GameState(myMap);
        GameStateFileStore.WriteObjectToFile(initialState);
    }
}
