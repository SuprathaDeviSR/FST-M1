package activities;

public class activity4 {

	public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];       
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

  
    public static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 10, 12, 1, 5, 6}; 

        System.out.println("Before sorting:");
        displayArray(numbers);

        insertionSort(numbers);

        System.out.println("After sorting:");
        displayArray(numbers);
    }
}
