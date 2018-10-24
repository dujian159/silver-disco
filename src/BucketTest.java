public class BucketTest {
    public static void main(String[] args) {
        int[] arr = {2,1,9,3,7,6,3,1,8,3};
        bucketSort(arr);
        for (int i = 0; i <  arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    // only for 0~200 value
    public static void bucketSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] bucket = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }
        int i = 0;
        for (int j = 0; j < bucket.length; j++) {
            while (bucket[j]-- > 0) {
                arr[i++] = j;
            }
        }
    }
}
