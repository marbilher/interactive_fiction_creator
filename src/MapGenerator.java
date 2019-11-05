public class MapGenerator {

    private LocationData[][] map;

    public LocationData[][] generateMap() {
        LocationData[][] mapXYArray = new LocationData[10][10]; //to-do prompt for grid size for large maps
        //grab this display from map class
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                LocationData locale = new LocationData(false, row + "x" + column); //temp descriptions
                mapXYArray[row][column] = locale;
            }
        }

        return mapXYArray;
    }
}
