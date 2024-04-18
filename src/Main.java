import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int failed = 0;
        for (int j = 0; j < 100; j++) {

            int[] randarray = new int[100];
            Random rand = new Random();
            for (int i = 0; i < randarray.length; i++) {
                randarray[i] = rand.nextInt(Integer.MAX_VALUE);
            }
            MergeSort a = new MergeSort();
            int[] res = a.recursiveMergeSort(randarray, 0, randarray.length);
            for (int i = 0; i < res.length - 1; i++) {
                if (res[i] <= res[i + 1]) continue;
                else {
                    failed++;
                    break;
                }
            }
        }
            System.out.println("failed: " + failed);
    }
}