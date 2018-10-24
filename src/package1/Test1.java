package package1;

public class Test1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1},{2},{3},{4}};
        int a = 0;
        int b = 0;
        int c = arr.length-1;
        int d = arr[0].length-1;
        while (a<=c&&b<=d){
            printN(arr,a++,b++,c--,d--);
        }

    }

    private static void printN(int[][] arr, int x, int y, int m, int n) {
        int a=x,b=y,c=m,d=n;
        if (a == c) {
            while (b<=d){
                System.out.println(arr[a][b]);
                b++;
            }
        } else if (b == d) {
            while(a<=c){
                System.out.println(arr[a][b]);
                a++;
            }
        }else{

            while (b<d){
                System.out.println(arr[a][b]);
                b++;
            }
            while(a<c){
                System.out.println(arr[a][d]);
                a++;
            }

            while(d>y){
                System.out.println(arr[c][d]);
                d--;
            }

            while (c>x){
                System.out.println(arr[c][y]);
                c--;
            }
        }


    }
}
