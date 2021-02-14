import java.util.*;

public class Main {
    
    static int counter = 0;
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(nums)
            .mapToInt(Integer::parseInt).toArray();      
        int[] result = bubbleSort(arr);
        System.out.println(counter);
        
    }
    
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                /* if a pair of adjacent elements has the wrong order it swaps them */
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    Main.counter++;
                }
            }
        }
    
        return array;
    }
}
