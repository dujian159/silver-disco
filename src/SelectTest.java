public class SelectTest {
    public static void main(String[] args) {
        int[] arr = {2,1,9,3,7,6,3,1,8,3};
        selectSort(arr);
        for (int i = 0; i <  arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j]){
                    swap(arr,min,j);

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
