package Day3PracticeProblem;

public class evenPosision {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 54, 65, 12, 25, 13};//array of the integer

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + ",");
        }
    }
}
