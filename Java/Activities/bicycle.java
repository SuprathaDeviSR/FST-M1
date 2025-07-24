package activities;

public class bicycle implements bicycleParts, bicycleOperations {
    int gears;
    int currentSpeed;

    public bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

   
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) currentSpeed = 0;
    }

    
    public void speedUp(int increment) {
        currentSpeed += increment;
        if (currentSpeed > maxSpeed) currentSpeed = maxSpeed;
    }

    public String bicycleDesc() {
        return "No of gears are " + gears + "\nSpeed of bicycle is " + currentSpeed;
    }




	}

