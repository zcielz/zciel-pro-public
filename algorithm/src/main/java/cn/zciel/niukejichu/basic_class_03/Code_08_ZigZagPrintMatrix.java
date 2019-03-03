package cn.zciel.niukejichu.basic_class_03;

/**
 * imgHelp:设置A，B两个点在（0,0）位置，
 * 运动轨迹，A总是向右移动，撞到最后的往下移动，B运动轨迹每次向下移动，撞到最下向右移动
 * A,B解耦，各走各的，A和b都会画出一个对角线
 * {@link static/img/basic_class_03/Code_08_ZigZagPrintMatrix/Snipaste_2019-03-02_08-27-03.png}
 * 思路只用加一个bool的变量，告诉是左上到右下还是右下到左上
 * <p>
 * “之”字形打印矩阵
 */
public class Code_08_ZigZagPrintMatrix {

    public static void printMatrixZigZag(int[][] matrix) {
        int aR = 0; //a的行列
        int aC = 0;
        int bR = 0; //b的行列
        int bC = 0;
        int endR = matrix.length - 1; //终点位置 行列
        int endC = matrix[0].length - 1;
        boolean fromUp = false; //判断是左上还是右下 右下还是左上
        while (aR != endR + 1) { //判断a的行不在endR越界的情况下
            //打印“之”形状 斜线
            printLevel(matrix, aR, aC, bR, bC, fromUp);
            //“之”两端的固定
            aR = aC == endC ? aR + 1 : aR; //如果a的列到达了右边界，就往下走，没到边界就不往下走
            aC = aC == endC ? aC : aC + 1; //如果a没到右边界，就往右走，到了边界右就不走了
            bC = bR == endR ? bC + 1 : bC; //如果b到了下边界，就往右走，否则就不往右走
            bR = bR == endR ? bR : bR + 1; //如果b没到下边界，就往下走，到了下边界就不往下走
            //每次做一个翻转
            fromUp = !fromUp;
            System.out.println();
        }
    }

    // 打印对角线
    private static void printLevel(int[][] matrix, int aR, int aC, int bR, int bC, boolean fromUp) {
        if (fromUp) {
            while (aR != bR + 1) { //a的行没到b位置的行的时候
                System.out.print(matrix[aR++][aC--] + " "); //斜向下移动
            }
        } else {
            while (bR != aR - 1) {
                System.out.print(matrix[bR--][bC++] + " "); //斜向上移动
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        printMatrixZigZag(matrix);
    }

}
