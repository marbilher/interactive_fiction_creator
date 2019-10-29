public class NewMapVisualizer {

    //private Object[][] mapData = null;
    private MapGenerator _mapGenerator;

//    public MapVisualizer(Object[][] map) {
//        mapData = map;
//    }

    public NewMapVisualizer(MapGenerator injectedMapGenerator) {
        _mapGenerator = injectedMapGenerator;
    }

    public void DrawMap() {
        //Object[][] mapMatrix = new Object[10][10];
        LocationData[][] mapMatrix = _mapGenerator.generateMap();
        for(int row = 0; row < 10; row++) {
            for(int column = 0; column < 10; column++) {
                if(mapMatrix[row][column].getAccessible()) {

                    System.out.print("[" + "X" + "]" + " ");
                } else {
                    System.out.print("[" + " " + "]" + " ");
                    //System.out.print(mapMatrix[row][column].getDescriptionText());
                }
            }
            System.out.println();
        }
    };
}
