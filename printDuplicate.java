package Day3PracticeProblem;

public class printDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 34, 1, 2, 54, 65, 12, 25, 13};//array of the integer
        System.out.println("array is :");
        for(int e :arr){
            System.out.print(e + "," );
        }
        System.out.println();
        System.out.println("duplicate of the array is :");
        for (int i = 0; i <= arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + "," );
                }

            }
        }

    }
}
