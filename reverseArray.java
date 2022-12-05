package Day3PracticeProblem;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 54, 65, 12, 25, 13};//array of the integer
        int i = 0;

        System.out.println("foword array is : " );
        for(int e : arr){
            System.out.print(e+",");
        }
        System.out.println();
        System.out.println("reverse array is : " );
        for (i = arr.length - 1; i >= 0; i--) {

            System.out.print( arr[i] + ",");
        }
    }
}
