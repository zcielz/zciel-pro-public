package cn.zciel.niukejichu.basic_class_01;

import cn.zciel.niukejichu.utils.CodeUtils;
import lombok.extern.slf4j.Slf4j;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

/**
 * @author YINZHEN
 * @date 2019/2/26 8:27
 * @Description
 */
@Slf4j
public class Code_00_BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
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
            bubbleSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }


}
