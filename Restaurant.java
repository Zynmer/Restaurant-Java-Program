public class Restaurant {
    
    // Properties
    private String Name;
    private int WaitTime;
    private double Rating;
    private double AvgPrice;
    private double Distance;
    private String HoursOpen;
 
    //Constructer
    public Restaurant() {}

    public Restaurant(String Name, int WaitTime, double Rating, double AvgPrice, double Distance, String HoursOpen) {
        
        this.WaitTime = WaitTime;
        this.Rating = Rating;
        this.AvgPrice = AvgPrice;
        this.Distance = Distance;
        this.HoursOpen = HoursOpen;
        this.Name = Name;

    }
    
    // Getters and Setters
    public int getWaitTime() {
    
        return WaitTime;

    }
   
    public void setWaitTime(int WaitTime) {
    
        this.WaitTime = WaitTime;

    }

    public double getRating() {

        return Rating;

    }

    public void setRating(double Rating) {

        this.Rating = Rating;

    }

    public double getAvgPrice() {

        return AvgPrice;

    }

    public void setAvgPrice(double AvgPrice) {

        this.AvgPrice = AvgPrice;

    }

    public double getDistance() {

        return Distance;

    }

    public void setDistance(double Distance) {

        this.Distance = Distance;

    }

    public String getHoursOpen() {

        return HoursOpen;

    }

    public void setHoursOpen(String HoursOpen) {

        this.HoursOpen = HoursOpen;

    }

    public String getName() {

        return Name;

    }

    public void setName(String Name) {

        this.Name = Name;

    }

    public String toString() {

        String output = String.format("Restaurant Name: %s%n"
                                    + "Wait Time:       %d%n"
                                    + "Rating:          %.1f%n"
                                    + "Average Price    %.1f%n"
                                    + "Distance:        %.1f%n"
                                    + "Hours Open:      %s%n", 
                                    Name, WaitTime, Rating, AvgPrice, Distance, HoursOpen);

        return output;

    }

}
