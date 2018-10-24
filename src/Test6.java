import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int arr[] = {5,6,7,1,3,2,1,4};
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left==right){
            return ;
        }
        int mid = left+((right-left)>>1);
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = 0;
        int p1 = left;
        int p2 = mid+1;
        int help[] = new int[right-left+1];
        while(p1 <=mid&&p2<=right){
            if(arr[p1]>arr[p2]) {
                for (int j = p2; j <= right; j++) {
                    System.out.println(arr[p1]+","+arr[j]);
                }

            }

            help[i++] = arr[p1]>arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=mid){
            help[i++]=arr[p1++];
        }
        while(p2<=right){
            help[i++]=arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[left + i] = help[i];
        }
    }

}

