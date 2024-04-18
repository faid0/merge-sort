public class MergeSort {

    // recursive merge sort algorithm
    public int[] recursiveMergeSort(int[] numbers, int from, int to){
        if(numbers == null) return numbers;
        if(numbers.length == 0) return numbers;
        if(to-from <= 1) return  new int[]{numbers[from]};

        int half = (from + to) / 2;
        int[] a = recursiveMergeSort(numbers, from, half);
        int[] b = recursiveMergeSort(numbers, half, to);

        int indexA = 0;
        int indexB = 0;
        int i = to-from;
        int[] res = new int[i];
        int index = 0;
        while(index < i){
            if(indexA == a.length){
                res[index] = b[indexB];
                indexB++;
            }else if(indexB == b.length){
                res[index] = a[indexA];
                indexA++;
            }else{
                if(a[indexA] <= b[indexB]){
                    res[index] = a[indexA];
                    indexA++;
                }else{
                    res[index] = b[indexB];
                    indexB++;
                }
            }
            index++;
        }
        return res;
    }

    public void threadedMergeSort(){
        
    }

}
