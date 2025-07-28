package activities;

public class Activity8 {

	public static void exceptionTest(String value) throws CustomException {
        if (value == null) {
            throw new CustomException("Error: Input string cannot be null!");
        } else {
            System.out.println("Input: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            
            Activity8.exceptionTest("Will print to console");

            
            Activity8.exceptionTest(null);

        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }

	}


