import java.util.Arrays;

public class EditControl {

    private static EditControl single_instance = null;

    public String editControlQuery;

    private EditControl()
    {
        editControlQuery = "(generate) new map or use (existing)?";
    }

    public static EditControl getInstance()
    {
        if (single_instance == null)
            single_instance = new EditControl();

        return single_instance;
    }

    public static void fetchMap() {
        //grab this display from map class

    }

}
