package Day3PracticeProblem;

public class smallestElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 34, 34, 1, 2, 54, 65, 12, 25, 13};//array of the integer
        int smallest = arr[0];//initialize
        int freq[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= smallest) {
                smallest = arr[i];//if small i is "i" will be the smallest
            }
        }
        System.out.println(smallest + " smallest");
    }
}
