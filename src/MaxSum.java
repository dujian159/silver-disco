public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-9,3,7,6,-3,-1,8,-3};
        int maxSun =  getSum(arr);
        System.out.println(maxSun);
    }

    private static int getSum(int[] arr) {
        int curNum=0,maxNum=0;
        for (int i = 0; i < arr.length; i++) {
            curNum+=arr[i];
            if (curNum>maxNum){
                maxNum = curNum;
            }else if(curNum<0){
                curNum=0;
            }
        }
        return maxNum;
    }

}
