import java.io.Serializable;

public class Coordinates implements Serializable {
    int x;
    int y;

    public Coordinates(int myX, int myY) {
        this.x = myX;
        this.y = myY;
    }
}
