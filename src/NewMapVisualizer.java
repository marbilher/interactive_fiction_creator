public class NewMapVisualizer {

    private LocationData[][] map;

    public NewMapVisualizer(LocationData[][] mapMatrix) {
        this.map = mapMatrix;
    }

    public void drawMap() {

        //LocationData[][] mapMatrix = _mapGenerator.generateMap();
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                if (this.map[row][column].getAccessible()) {    //we can use the LocationDataController here

                    System.out.print("[" + "X" + "]" + " ");     //however we dont want to create 100 new classes
                } else {
                    System.out.print("[" + " " + "]" + " ");
                }
            }
            System.out.println();
        }
    }
}
