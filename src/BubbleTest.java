public class BubbleTest {
    public static void main(String[] args) {
        int[] arr = {2,1,9,3,7,6,3,1,8,3,0,-1};
        bubbleSort(arr);
        for (int i = 0; i <  arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length-1; i >= 0 ; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
