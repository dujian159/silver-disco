public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,2,4,6,8,0};
        int num = 5;
        sort(arr,num);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void sort(int arr[],int num){
        int left = -1;
        int right = arr.length;
        int index = 0;
        while(index<right){
            if(arr[index]<num){
                swap(arr,++left, index++);
            }
            if(arr[index]>num){
                swap(arr,--right, index);
            }
            if(arr[index]==num){
                index++;
            }
        }
    }
    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
