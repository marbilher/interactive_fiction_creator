import java.io.Serializable;

public class GameState implements Serializable {
    private LocationData[][] mapState;
    private Coordinates savedPlayerLocation;

    public GameState(LocationData[][] mapData) {
        this.mapState = mapData;
        this.savedPlayerLocation = new Coordinates(0, 0); //temporary, method to set in the edit dialogue on initial state p

    }

    public LocationData[][] getMapState() {
        return this.mapState;
    }

    public void setMapState(LocationData[][] incomingMap) {
        this.mapState = incomingMap;
    }

    public void setSavedPlayerLocation(Coordinates currentLocation) {
        this.savedPlayerLocation = currentLocation;
    }

    public Coordinates getSavedPlayerLocation() {
        return this.savedPlayerLocation;
    }
}
