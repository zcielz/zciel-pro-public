package cn.zciel.niukejichu.basic_class_01;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

public class Code_05_MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);

    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            //如果左侧等于右侧直接返回null
            return;
        }
        //取出中间的值
        int mid = l + ((r - l) >> 1); //中点位置
        //排序左边的数组
        mergeSort(arr, l, mid); //左侧l 到 mid的数据
        //排序右边的数组
        mergeSort(arr, mid + 1, r); //右侧部分排好序
        //归并排序
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1]; // l 到r 上的辅助数组
        int i = 0;
        int p1 = l; //左侧部分第一个数
        int p2 = m + 1; //右侧部分第一个数
        while (p1 <= m && p2 <= r) {
            //按照循序添加最小的数值
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++]; //谁小添加谁
        }
        //补充添加一些还没添加的
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        //将数值赋值到原数组
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
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
            mergeSort(arr1);
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
        mergeSort(arr);
        printArray(arr);

    }

}
