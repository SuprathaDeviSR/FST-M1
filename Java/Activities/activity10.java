package activities;
import java.util.HashSet;
public class activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

        
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Elderberry");
        hs.add("Fig");

        
        System.out.println("Initial size of the HashSet: " + hs.size());

        boolean removed = hs.remove("Date");
        System.out.println("Removed 'Date': " + removed);

       
        boolean removedNonExisting = hs.remove("Grapes");
        System.out.println("Tried removing 'Grapes' (not in set): " + removedNonExisting);

        boolean hasApple = hs.contains("Apple");
        System.out.println("Does the set contain 'Apple'? " + hasApple);

      
        System.out.println("Updated HashSet: " + hs);
    
	}

}
