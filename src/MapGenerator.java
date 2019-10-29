public class MapGenerator {

    public LocationData[][] generateMap() {
        LocationData[][] mapXYArray = new LocationData[10][10]; //to-do prompt for grid size for large maps
        //grab this display from map class
        for(int row = 0; row < 10; row++) {
            for(int column = 0; column < 10; column++) {
                LocationData locale = new LocationData(false, "location: " + row + column);
                mapXYArray[row][column] = locale;
            }
        }
        //temporary test of map display
        LocationData locale = new LocationData(true, "Cheese");
        mapXYArray[2][2] = locale;
        return mapXYArray;
    }
}
