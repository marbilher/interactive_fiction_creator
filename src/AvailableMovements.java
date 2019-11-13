import java.util.ArrayList;
import java.util.HashMap;

public class AvailableMovements {
    //ArrayList for directional movement in anticipation of diagonals, z-movement and map transfers
    private ArrayList<String> stringDirections = new ArrayList<String>();
    private ArrayList<Coordinates> coordDirections = new ArrayList<Coordinates>();
    private HashMap<String, Coordinates> directionalMap = new HashMap<String, Coordinates>();

    AvailableMovements(Coordinates currentCoord, LocationData[][] currentMap) {
        this.stringDirections = calculateStringDirections(currentCoord, currentMap);
        //this.coordDirections = getCoordDirections(currentCoord, currentMap);
    }

    public void printStringDirections() {
        for (String directions : this.stringDirections) {
            System.out.println(directions);
        }
    }

    public ArrayList<String> calculateStringDirections(Coordinates currentCoords, LocationData[][] currentMap) {
        this.directionalMap.clear();
        this.stringDirections.clear();
        this.coordDirections.clear();   //refresh available movements every query

        if (currentCoords.x + 1 < currentMap.length && currentMap[currentCoords.x + 1][currentCoords.y] != null) {
            directionalMap.put("east", new Coordinates(currentCoords.x + 1, currentCoords.y));
            stringDirections.add("east");
            coordDirections.add(new Coordinates(currentCoords.x + 1, currentCoords.y));
        }
        if (currentCoords.x - 1 >= 0 && currentMap[currentCoords.x - 1][currentCoords.y] != null) {
            directionalMap.put("west", new Coordinates(currentCoords.x - 1, currentCoords.y));
            stringDirections.add("west");
            coordDirections.add(new Coordinates(currentCoords.x - 1, currentCoords.y));
        }
        if (currentCoords.y + 1 < currentMap[0].length && currentMap[currentCoords.x][currentCoords.y + 1] != null) {
            directionalMap.put("south", new Coordinates(currentCoords.x, currentCoords.y + 1));
            stringDirections.add("south");
            coordDirections.add(new Coordinates(currentCoords.x, currentCoords.y + 1));
        }
        if (currentCoords.y - 1 >= 0 && currentMap[currentCoords.x][currentCoords.y - 1] != null) {
            directionalMap.put("north", new Coordinates(currentCoords.x, currentCoords.y - 1));
            stringDirections.add("north");
            coordDirections.add(new Coordinates(currentCoords.x, currentCoords.y - 1));
        }
        return this.stringDirections;   //refactor this
    }

    public ArrayList<Coordinates> getCoordDirections(Coordinates currentCoords, LocationData[][] currentMap) {
        return this.coordDirections;
    }

    public ArrayList<String> getStringDirections() {
        return this.stringDirections;
    }

    public HashMap<String, Coordinates> getDirectionalMap() {
        return this.directionalMap;
    }


    public void setStringDirections(Coordinates myCoord) {

    }

}
