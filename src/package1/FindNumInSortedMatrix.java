package package1;

public class FindNumInSortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[][] { 
                { 0, 1, 2, 3, 4, 5, 6 },
                { 10, 12, 13, 15, 16, 17, 18 },
                { 23, 24, 25, 26, 27, 28, 29 },
                { 44, 45, 46, 47, 48, 49, 50 },
                { 65, 66, 67, 68, 69, 70, 71 },
                { 96, 97, 98, 99, 100, 111, 122 },
                { 166, 176, 186, 187, 190, 195, 200 },
                { 233, 243, 321, 341, 356, 370, 380 }
        };
        int K = 1233;
        System.out.println(isContains(matrix, K));
    }

    private static boolean isContains(int[][] matrix, int k) {
        int row = 0;
        int col = matrix[0].length-1;
        while (row<matrix.length&&col>=0){
            if(matrix[row][col]==k){
                return true;
            }else if(matrix[row][col]>k){
                col--;
            }else{
                row++;
            }
        }
        return  false;
    }
}
