package Day3PracticeProblem;

import java.util.Arrays;

public class ascendingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 34, 1, 2, 54, 65, 12, 25,13};//array of the integer
        Arrays.sort(arr); //using arrays.sort method
        System.out.println("sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
