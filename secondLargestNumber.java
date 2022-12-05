package Day3PracticeProblem;

public class secondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 34, 1, 2, 54, 65, 12, 25, 13};//array of the integer
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0; //for storemg value of i
                if (arr[i] > arr[j]) { //
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i]+ ",");
        }
        System.out.println("second largest number in array is :");
        System.out.println(arr[arr.length - 2]);
    }
}
