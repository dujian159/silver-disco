public class BigHeapBuild {
    public static void main(String[] args) {
        int[] arr = {3,6,4,2,8,7,5,1,9};
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr,i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void heapInsert(int[] arr, int i) {
        while(arr[i]>arr[(i-1)/2]){
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
