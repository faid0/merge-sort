public class MergeSort {

    // recursive merge sort algorithm(to is exclusive)
    public void recursiveMergeSort(int[] numbers, int from, int to){
        // Base case and edge cases:
        // If the array is null, empty, or has only one element, or 'from' index is greater than or equal to 'to',
        // there's nothing to sort.
        if (numbers == null || numbers.length <= 1 || from >= to || to-from <= 1) {
            return;
        }
        // Get the middle index of the array
        int half = from + (to - from) / 2;

        // Recursive call to sort the left half of the array
        recursiveMergeSort(numbers, from, half);

        // Recursive call to sort the right half of the array
        recursiveMergeSort(numbers, half, to);

        // Merge both sorted halves
        merge(numbers, from, half, to);
    }

    // Threaded merge sort algorithm
    public void threadedMergeSort(){
        // TODO implement threaded merge sort
    }

    // Merge two sorted subarrays: [from, mid) and [mid, to)
    private void merge(int[] numbers, int from, int mid, int to){
        // Initialize necessary indices and temporary array
        int index = 0;
        int indexA = from;
        int indexB = mid;
        int i = to-from ;
        int[] temp = new int[i];

        // Iterate over the entire range
        while(index < i){
            // Check if either the left or right subarray is empty
            if(indexA == mid){
                temp[index] = numbers[indexB++];
            }else if(indexB == to){
                temp[index] = numbers[indexA++];
            }else{
                // Compare elements from both subarrays and merge them into temp array
                if(numbers[indexA] <= numbers[indexB]){
                    temp[index] = numbers[indexA++];
                }else{
                    temp[index] = numbers[indexB++];
                }
            }
            index++;
        }

        // Replace elements in the original array with the sorted elements from temp array
        for (i = from; i<to; i++){
            numbers[i] = temp[i-from];
        }

    }

}
