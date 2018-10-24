public class Test4 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        int arr[] = {7, 2, 1, 3, 8, 5,1,3,5,4,7,9,11,16,3,45,78,95,24,14};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
    public static void insertSort(int arr[]){
        int j;
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            //当j>=0,并且temp小于其左边的第一个数时继续循环，否则跳出，因为左边是已经从小到大排好序的
            for (j=i-1;j>=0&&temp<arr[j];j--){
                arr[j+1] = arr[j];
            }
            //跳出循环时还会执行一次j--，所以此处应为arr[j+1] 而不是arr[j]
            arr[j+1] = temp;
        }
    }
    public static void  swap(int arr[],int j,int k){
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
