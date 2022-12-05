package Day3PracticeProblem;


public class printElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 34, 1, 2, 54, 65, 12, 25,13};//array of the integer

        int visit = -1;
        int freq[] = new int[arr.length];
        for (int i = 0; i <= arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visit;
                }
                if (freq[i] != visit) {
                    freq[i] = count;
                }
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visit) {
                System.out.println(arr[i] + "|" + freq[i]);
            }
        }
    }
}
