import java.util.Scanner;

public class EditControl {

    private static EditControl single_instance = null;

    public String editControlQuery;
    private String choice = null;
    Scanner sc = new Scanner(System.in);    //research this error
    private LocationData[][] myMap;

    private EditControl() {
        editControlQuery = "(generate) new map or use (existing)?"; //map load logic comes later
    }

    public static EditControl getInstance() {
        if (single_instance == null)
            single_instance = new EditControl();

        return single_instance;
    }

    public static void fetchMap() {
        //grab this display from map class

    }

    public void editMapOptions() {
        //System.out.println(this.editControlQuery);
        MapGenerator mapGen = new MapGenerator();     //creating new map, load logic will change this
        myMap = mapGen.generateMap();
        NewMapVisualizer mapVisualize = new NewMapVisualizer(myMap);
        mapVisualize.drawMap();                                                             //design map so only 1 can exist
        LocationDescriptionUpdater descriptionUpdater = new LocationDescriptionUpdater();   //funcs that change map shouldnt hold map in constructor
        descriptionUpdater.updateDescription(myMap);                                        //are we saving map and grab from save file?
    }

}
