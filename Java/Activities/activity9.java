package activities;
import java.util.ArrayList;
public class activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();

        
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Diana");
        myList.add("Ethan");

      
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

     
        String thirdName = myList.get(2);
        System.out.println("\n3rd name in the list: " + thirdName);

      
        boolean hasDiana = myList.contains("Diana");
        System.out.println("Does the list contain 'Diana'? " + hasDiana);


        System.out.println("Size of the list: " + myList.size());

        
        myList.remove("Charlie"); 
        System.out.println("Removed 'Charlie' from the list.");

        System.out.println("New size of the list: " + myList.size());
    }
}



