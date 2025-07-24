package activities;

public class activity6 {

	public static void main(String[] args) throws InterruptedException {
		plane plane = new plane(10);

        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");
        plane.onboard("David");

        System.out.println("Plane took off at: " + plane.takeOff());

       
        System.out.println("Passengers on board: " + plane.getPassengers());


        Thread.sleep(5000);


        plane.land();

    
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());

       
        System.out.println("Passengers after landing: " + plane.getPassengers());
    }

	}


