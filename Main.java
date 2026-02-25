import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Instantiate ArrayList to hold Restaurant Objects
        ArrayList<Restaurant> restaurantList = new ArrayList<>();

        //Take user input using JOptionPane and store in a variable
        String name = JOptionPane.showInputDialog("Enter restaurant name: ");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter wait time in number of minutes (ex. 30): "));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter rating (ex. 5.0): "));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter average price to eat (ex. 12.50): "));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter distance to restaurant in miles (ex. 5.7): "));
        String hoursOpen = JOptionPane.showInputDialog("Enter hours open (ex. 0900 - 1700): ");

        //Instantiate Restaurant Object with variables
        Restaurant userObject = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);
        System.out.println(userObject);

        //Add user's Object to array list
        restaurantList.add(userObject);
        
    
    }
}


