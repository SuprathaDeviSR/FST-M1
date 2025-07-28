package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter integers (type a non-integer to stop):");

        
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

       
        scan.close();

       
        Integer[] nums = list.toArray(new Integer[0]);

        
        if (nums.length == 0) {
            System.out.println("No numbers were entered.");
            return;
        }

        
        int randomIndex = indexGen.nextInt(nums.length);
        System.out.println("Random index generated: " + randomIndex);
        System.out.println("Value at that index: " + nums[randomIndex]);
    }
}
