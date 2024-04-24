import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int failed = 0;
        long startTime = System.nanoTime();
        for (int j = 0; j < 100; j++) {
            Random rand = new Random();
            int randIndex = rand.nextInt(0,999999);
            int[] randarray = new int[randIndex];
            for (int i = 0; i < randarray.length; i++) {
                randarray[i] = rand.nextInt();
            }

            int[] sorted = Arrays.stream(randarray).sorted().toArray();
            MergeSort a = new MergeSort();
            a.recursiveMergeSort(randarray, 0, randarray.length);
            if(!Arrays.equals(randarray, sorted)) {
                System.out.println("should be:" + Arrays.toString(sorted));

                System.out.println("but is:" + Arrays.toString(randarray) +"\n");
                failed++;
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Dauer: " + duration + " Millisekunden");
        System.out.println("failed: " + failed);
    }
}