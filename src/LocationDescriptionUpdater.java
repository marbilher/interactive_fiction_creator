import java.util.Scanner;

public class LocationDescriptionUpdater {

    private String choice;
    Scanner sc = new Scanner(System.in);


    private int row;
    private int column;

    public void updateDescription(LocationData[][] myMap) {
        System.out.println("Which map location do you want to edit? Input format #x# ie: 0x1 or 3x7");
        choice = sc.nextLine();
        if (choice.length() == 3) {
            row = Character.digit(choice.charAt(0), 10);
            column = Character.digit(choice.charAt(2), 10);
        } // add input validation logic, refactor this into a function to call itself
        System.out.println("Enter new description text: ");
        choice = sc.nextLine();
        LocationDataController currentLocation = new LocationDataController(myMap[row][column]);
        currentLocation.setLocationDescriptionText(choice);
        System.out.println("Saved: " + myMap[row][column].getDescriptionText() + " " + "Stored at: " + row + "x" + column);
    }
}
