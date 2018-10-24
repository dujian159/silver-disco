package package1;

import java.util.Map;

public class TestRotate {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printlnMatrix(matrix);
        rotate(matrix);
        System.out.println("翻转后----");
        printlnMatrix(matrix);
    }

    private static void printlnMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        //行
        int dR = matrix.length-1;
        int dC = matrix[0].length-1;
        while(tR<dR){
            rotateEdge(matrix,tR++,tC++,dR--,dC--);
        }
    }

    private static void rotateEdge(int[][] matrix, int tR, int tC, int dR, int dC) {
        int rotateTimes = dR-tR;
        int temp = 0;
        for (int i = 0; i < rotateTimes; i++) {
            temp = matrix[tR][tC+i];
            matrix[tR][tC+i] = matrix[dR-i][tC];
            matrix[dR-i][tC] = matrix[dR][dC-i];
            matrix[dR][dC-i] = matrix[tR+i][dC];
            matrix[tR+i][dC] = temp;
        }
    }

}
