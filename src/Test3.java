import java.util.Arrays;

public class Test3 {
   /* public static void main(String[] args) {
        int arr[] = {7, 2, 1, 3, 8, 5};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }*/
    public static void selectSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                swap(arr,i,min);
            }
        }
    }
    public static void  swap(int arr[],int j,int k){
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
    }
    //1、实现一个绝对正确但是复杂度不好的方法B，使用的是JDK提供的Arrays类的排序方法
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }


    //2、实现一个随机样本产生器
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        //产生随机数范围为[0,maxSize]
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            //产生[-maxValue,maxValue]的元素
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    //拷贝数组
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    //3、实现比对的方法
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //5、如果有一个样本使得比对出错，打印样本分析是哪个方法出错
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        //4、把方法a和方法b比对很多次来验证方法a是否正确
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            selectSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        selectSort(arr);
        printArray(arr);
    }
}
