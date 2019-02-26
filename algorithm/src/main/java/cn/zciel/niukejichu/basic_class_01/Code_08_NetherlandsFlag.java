package cn.zciel.niukejichu.basic_class_01;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

/**
 * 荷兰国旗问题
 */
public class Code_08_NetherlandsFlag {

    public static int[] partition(int[] arr, int l, int r, int p) {
        int less = l - 1;
        int more = r + 1;
        while (l < more) {
            if (arr[l] < p) {
                swap(arr, ++less, l++); //把小于区域的交换 小于区域的是less l左侧的位置
            } else if (arr[l] > p) {
                swap(arr, --more, l); //大于区域的前一个位置和当前交换
            } else {
                l++; //等于就直接加加，等于的就是左边界和右边界
            }
        }
        return new int[]{less + 1, more - 1}; //等于区域的左边界和右边界
    }

    public static void main(String[] args) {
        int[] test = generateArray();

        printArray(test);
        int[] res = partition(test, 0, test.length - 1, 1);
        printArray(test);
        System.out.println(res[0]);
        System.out.println(res[1]);
        printArray(res);

    }

}
