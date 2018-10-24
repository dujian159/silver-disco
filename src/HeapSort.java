public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3,6,4,2,8,7,5,1,9};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void heapSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        //建立大根堆
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while( heapSize >0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }
    }

    private static void heapify(int[] arr, int i, int heapSize) {
        int left = i*2+1;
        while(left<heapSize){
            int largest = left+1<heapSize&&arr[left+1]>arr[left]?left+1:left;
            largest = arr[largest]>arr[i]?largest:i;
            if (largest==i){
                break;
            }
            swap(arr,largest,i);
            i = largest;
            left = i*2+1;
        }
    }

    private static void heapInsert(int[] arr, int i) {
        while (arr[i]>arr[(i-1)/2]){
            swap(arr,i,(i-1)/2);
            i=(i-1)/2;
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
