package activities;

public class activity2 {

	public static void main(String[] args) {
		int[] numbers = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        for (int number : numbers) {
            if (number == 10) {
                sum += number;
            }
        }
        if (sum == 30) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


	}

}
