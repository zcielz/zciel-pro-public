package cn.zciel.niukejichu.basic_class_03;

/**
 * 旋转 只能正方形 长方形就会转出去了
 */
public class Code_05_RotateMatrix {

    public static void rotate(int[][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR < dR) {
            rotateEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    //左上行号和列号 右下行号和列号
    public static void rotateEdge(int[][] m, int tR, int tC, int dR, int dC) {
        int times = dC - tC; //他们之间的距离
        int tmp = 0;
        for (int i = 0; i != times; i++) {
            tmp = m[tR][tC + i]; //第一行第一个数
            m[tR][tC + i] = m[dR - i][tC]; //让第一个数和左边角第一个
            m[dR - i][tC] = m[dR][dC - i]; //
            m[dR][dC - i] = m[tR + i][dC];
            m[tR + i][dC] = tmp;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i != matrix.length; i++) {
            for (int j = 0; j != matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printMatrix(matrix);
        rotate(matrix);
        System.out.println("=========");
        printMatrix(matrix);
    }


}
