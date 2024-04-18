import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int failed = 0;
        for (int j = 0; j < 100; j++) {
            Random rand = new Random();
            int randIndex = rand.nextInt(0,999999);
            int[] randarray = new int[randIndex];
            for (int i = 0; i < randarray.length; i++) {
                randarray[i] = rand.nextInt();
            }

            MergeSort a = new MergeSort();
            int[] res = a.recursiveMergeSort(randarray, 0, randarray.length);
            if(!Arrays.equals(res, Arrays.stream(randarray).sorted().toArray()))
                failed++;
        }
        System.out.println("failed: " + failed);
    }
}