import java.util.ArrayList;

public class AvailableMovements {

    private ArrayList<String> stringDirections = new ArrayList<String>();
    private Coordinates[] coordDirections;

    AvailableMovements(Coordinates currentCoord, LocationData[][] currentMap) {
        this.stringDirections = getStringDirections(currentCoord, currentMap);
        //this.coordDirections = getCoordDirections(currentCoord, currentMap);
    }

    public void printStringDirections() {
        this.stringDirections.forEach((dir) -> System.out.println(dir));
    }

    public ArrayList<String> getStringDirections(Coordinates currentCoords, LocationData[][] currentMap) {
        this.stringDirections.clear();
        //add out of bounds checks
        if (currentMap[currentCoords.x + 1][currentCoords.y] != null) {
            stringDirections.add("east");
        }
        if (currentMap[currentCoords.x - 1][currentCoords.y] != null) {
            stringDirections.add("west");
        }
        if (currentMap[currentCoords.x][currentCoords.y + 1] != null) {
            stringDirections.add("north");
        }
        if (currentMap[currentCoords.x][currentCoords.y - 1] != null) {
            stringDirections.add("south");
        }
        return this.stringDirections;
    }

//    public Coordinates[] getCoordDirections(Coordinates currentCoords, LocationData[][] currentMap) {
//
//    }

    public void setStringDirections(Coordinates myCoord) {

    }

}
