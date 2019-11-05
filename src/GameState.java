import java.io.Serializable;

public class GameState implements Serializable {
    private LocationData[][] mapState;

    public GameState(LocationData[][] mapData) {
        this.mapState = mapData;
    }

    public LocationData[][] getMapState() {
        return this.mapState;
    }

    public void setMapState(LocationData[][] incomingMap) {
        this.mapState = incomingMap;
    }
}
