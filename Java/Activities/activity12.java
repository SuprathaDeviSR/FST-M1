package activities;

public class activity12 {

	public static void main(String[] args) {
		Addable ad1 = (a, b) -> (a + b);

        
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };

        
        System.out.println("Result using ad1: " + ad1.add(10, 20));
        System.out.println("Result using ad2: " + ad2.add(15, 25));
    }

	}


