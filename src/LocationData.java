import java.util.Map;

public class LocationData {
    private boolean accessible;
    private String descriptionText;

    public LocationData(boolean accessible, String descriptionText) {
        this.accessible = accessible;
        this.descriptionText = descriptionText;
    }

    public boolean getAccessible() {
        return this.accessible;
    }

    public String getDescriptionText() {
        return this.descriptionText;
    }

    public void setAccessible(boolean isAccessible) {
        this.accessible = isAccessible;
    }

    public void setDescriptionText(String incomingText) {
        this.descriptionText = incomingText;
    }
}
