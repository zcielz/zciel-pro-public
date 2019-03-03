package cn.zciel.niukejichu.basic_class_03;

/**
 * 有序的数组中找数
 * {@link static/img/basic_class_03/Code_09_FindNumInSortedMatrix/Snipaste_2019-03-02_08-51-05.png}
 */
public class Code_09_FindNumInSortedMatrix {

    public static boolean isContains(int[][] matrix, int k) {
        int row = 0; //从第一行最后一个位置为起点
        int col = matrix[0].length - 1;
        while (row < matrix.length && col > -1) { //如果行操作数组长度，列大于-1
            if (matrix[row][col] == k) {
                System.out.println(row + " " + col);
                return true;
            } else if (matrix[row][col] > k) { //如果找到的数大于当前数，row--
                col--;
            } else { //如果当前数小于 让行++
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0, 1, 2, 3, 4, 5, 6},// 0
                {10, 12, 13, 15, 16, 17, 18},// 1
                {23, 24, 25, 26, 27, 28, 29},// 2
                {44, 45, 46, 47, 48, 49, 50},// 3
                {65, 66, 67, 68, 69, 70, 71},// 4
                {96, 97, 98, 99, 100, 111, 122},// 5
                {166, 176, 186, 187, 190, 195, 200},// 6
                {233, 243, 321, 341, 356, 370, 380} // 7
        };
        int K = 233;
        System.out.println(isContains(matrix, K));
    }


}
