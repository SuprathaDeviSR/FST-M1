package activities;

public class activity7 {

	public static void main(String[] args) {
		mountainbike mb = new mountainbike(3, 0, 25);

        System.out.println(mb.bicycleDesc());

        mb.speedUp(20);
        System.out.println("After speeding up: " + mb.currentSpeed);

        mb.applyBrake(5);
        System.out.println("After applying brake: " + mb.currentSpeed);

        mb.setHeight(30);
        System.out.println("After setting seat height: " + mb.seatHeight);
    }


	}


