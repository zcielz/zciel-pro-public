package cn.zciel.niukejichu.basic_class_01;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

/**
 * @author YINZHEN
 * @date 2019/2/26 11:25
 * @Description
 */
public class Code_04_QuickSort {

    public static void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int l, int r) {
        if (l < r) { //只有左侧小于右侧的时候
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);//随机快排 就是最后边的一个数作为快排的参照物
            int[] p = partition(arr, l, r);
            quickSort(arr, l, p[0] - 1);
            quickSort(arr, p[1] + 1, r);
        }
    }

    private static int[] partition(int[] arr, int l, int r) {
        int less = l - 1; //取出左边-1位置 （如果为0，就是-1）
        int more = r; //最后侧的位置
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);//左侧+1的位置的数 和 最后侧数交换，这里就相当于less的坐标+1，
            } else if (arr[l] > arr[r]) {  //数字大 就将
                swap(arr, --more, l); //more 最后侧的位置-1，与
            } else {
                l++;  //如果相等，就单纯移动左边坐标的位置
            }
        }
        swap(arr, more, r); //将最右侧的数字恢复到中间
        return new int[]{less + 1, more}; //返回中间字段信息
    }

    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            quickSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        quickSort(arr);
        printArray(arr);

    }

}
