import java.util.HashMap;
import java.util.Map;

public class Test10 {
    public static void main(String[] args) {
        int arr[] = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
        printAmount(arr);
    }

    private static void printAmount(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println(key+"出现："+map.get(key)+"次");
        }
    }

}
