public class Test5 {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        System.out.println(getMax(arr,0,arr.length-1));
    }

    private static int getMax(int[] arr, int left, int right) {
        if(left==right){
            return arr[left];
        }
        int mid = (left+right)/2;
        int maxLeft=getMax(arr,left,mid);
        int maxRight=getMax(arr,mid+1,right);
        return  maxLeft>maxRight?maxLeft:maxRight;
    }
}
