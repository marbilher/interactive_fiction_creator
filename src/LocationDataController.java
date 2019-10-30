public class LocationDataController {
    private LocationData locationData;

    public LocationDataController(LocationData locationData) {
        this.locationData = locationData;
    }

    public boolean getIfLocationAccessible() {
        return locationData.getAccessible();
    }

    public String getLocationDescriptionText() {
        return locationData.getDescriptionText();
    }

    public void setLocationAccessible(boolean isAccessible) {
        locationData.setAccessible(isAccessible);
    }

    public void setLocationDescriptionText(String incomingText) {
        locationData.setDescriptionText(incomingText);
    }

}
