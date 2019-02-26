package cn.zciel.niukejichu.basic_class_01;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

/**
 * @author YINZHEN
 * @date 2019/2/26 9:27
 * @Description
 */
public class Code_03_HeapSort {
    //TODO
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i); //0~i 每次获得一个大根堆
        }
        int size = arr.length;
        swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }

    }

    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] arr, int index, int size) { //往下沉

        int left = index * 2 + 1; //左孩子
        while (left < size) { //不越界
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            //右孩子不越界，右孩子比左孩子大，哪个大，谁的下标就算largest
            largest = arr[largest] > arr[index] ? largest : index; //最大和Index比较
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1; //重复这个
        }
    }


    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            heapSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        heapSort(arr);
        printArray(arr);
    }

}
