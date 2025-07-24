package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

   
    public plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

   
    public void onboard(String passengerName) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passengerName);
        } else {
            System.out.println("Plane is full. Cannot onboard " + passengerName);
        }
    }

    
    public Date takeOff() {
        lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }

    
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

   
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    
    public List<String> getPassengers() {
        return passengers;
    }

}
