public class TestBucket {
    public static void main(String[] args) {
        int[] arr = {2,1,9,3,7,6,3,1,8,3};
        bucketSort(arr);
        for (int i = 0; i <  arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bucketSort(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            max = Math.max(max,arr[i]);
        }
        int[] help = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            help[arr[i]]++;
        }

        int i = 0;
        for (int j = 0; j < help.length; j++) {
            while (help[j]-- > 0) {
                arr[i++] = j;
            }
        }
    }
}
