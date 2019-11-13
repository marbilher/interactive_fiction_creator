import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameStateFileStore {

    private static final String file = "GameState.ser";


    public static Object ReadObjectFromFile(String filepath) {
        long startTime = System.currentTimeMillis();

        try {

            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();
            long endTime = System.currentTimeMillis();
            System.out.println("The Object has been read from the file");
            System.out.println("That took " + (endTime - startTime) + " milliseconds");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void WriteObjectToFile(Object serObj) {
        long startTime = System.currentTimeMillis();

        try {

            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            long endTime = System.currentTimeMillis();
            System.out.println("The Object has been read from the file");
            System.out.println("That took " + (endTime - startTime) + " milliseconds");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
