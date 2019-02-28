package cn.zciel.niukejichu.basic_class_03;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:52
 * @Description 环形打印 矩阵螺旋顺序
 */
public class Code_06_PrintMatrixSpiralOrder {
    //tR左上角的行 tC左上角的列 dR右下角的行 dC右下角的列
    //matrix.length是有多少个列  matrix[0].length是行有多少个数
    public static void spiralOrderPrint(int[][] matrix) {
        int tR = 0; //初始左上角的行为0                      行    左上角
        int tC = 0; //左上角的列为0                          列
        int dR = matrix.length - 1;  //右下角的行为右下角     行    右下角
        int dC = matrix[0].length - 1;  //右下角的列为        列
        while (tR <= dR && tC <= dC) {  //如果左上角的行小于等于右下角的行，左上角的列小于等于右下角的列
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    //左上角的行 和 右下角的列的关系  左上角的行移动
    public static void printEdge(int[][] m, int tR, int tC, int dR, int dC) {
        if (tR == dR) {  //如果左上角的行和右下角的行在同一行
            for (int i = tC; i <= dC; i++) {  //就是到了右小角了
                System.out.print(m[tR][i] + " ");
            }
        } else if (tC == dC) {  //左上角的列和右小角的列在同一列
            for (int i = tR; i <= dR; i++) {
                System.out.print(m[i][tC] + " ");
            }
        } else {
            int curC = tC; //当前的列
            int curR = tR; //当前的行
            while (curC != dC) {  //当前的列不等于右小角的列 向右移动
                System.out.print(m[tR][curC] + " ");
                curC++;
            }
            while (curR != dR) { //当前的行不等于右下角的列 向下移动
                System.out.print(m[curR][dC] + " ");
                curR++;
            }
            while (curC != tC) { //当前的列不等于左上角的列 向左移动
                System.out.print(m[dR][curC] + " ");
                curC--;
            }
            while (curR != tR) { //当前的行不等于左上角的行 向上移动
                System.out.print(m[curR][tC] + " ");
                curR--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        /*System.out.print(matrix.length - 1);
        System.out.print(matrix.length);
        System.out.print(matrix[0].length - 1);*/
        spiralOrderPrint(matrix);
    }
}
