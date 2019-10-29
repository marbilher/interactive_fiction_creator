public class PlayControl {

    private static PlayControl single_instance = null;

    public String s;

    private PlayControl()
    {
        s = "I control Play";
    }

    public static PlayControl getInstance()
    {
        if (single_instance == null)
            single_instance = new PlayControl();

        return single_instance;
    }

}
