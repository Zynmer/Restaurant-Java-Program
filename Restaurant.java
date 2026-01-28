public class Restaurant {
    
    // Properties
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;
 
    //Constructer
    public Restaurant() {}

    public Restaurant(int waitTime, double rating, double avgPrice, double distance, String hoursOpen) {

        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;

    }
}
