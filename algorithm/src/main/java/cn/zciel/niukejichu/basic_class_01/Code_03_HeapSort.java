package cn.zciel.niukejichu.basic_class_01;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

/**
 * @author YINZHEN
 * @date 2019/2/26 9:27
 * @Description
 *  堆概念 二叉树 堆可以在数组上伸缩的
 *  大根堆：完全二叉树，任何一个子数头部都是子数的头部最大值形成的完全二叉树
 *  小根堆：同上，最小值
 *  TODO: MedianQuick
 *  方式：让数组变成一个大根堆，(未必有序），最后一个位置和堆顶位置做交换（最大的位置出来），剩下的位置再做成一个堆（0~size1),重新调整大根堆，再次重复开始的操作。直接到堆没有了
 */
public class Code_03_HeapSort {

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i); //0~i 每次获得一个大根堆
        }
        int size = arr.length; //等于数组的全部
        swap(arr, 0, --size);  //最后一个数组和0位置做交换
        while (size > 0) { //直到堆的大小减少到0
            heapify(arr, 0, size); //生成大根堆
            swap(arr, 0, --size); //再次做交换
        }
    }

    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) { //i位置， a[(index-1)/2] 父位置
            swap(arr, index, (index - 1) / 2); //只要比我的父位置大，就和我的父位置交换
            index = (index - 1) / 2; //然后Index往上移动 再去看之前的父，直到不用比较（当前小于父的时候）
        }
    }

    /**
     * 0-size上形成的堆
     * @param arr
     * @param index index上面的值变小了 导致index上面的数往下面沉 形成堆结构
     * @param size 堆上一共有多少个数，或者一个数组中有多少个数是堆
     */
    public static void heapify(int[] arr, int index, int size) { //往下沉（数组有一个值发生变化，重新生成大根堆）

        int left = index * 2 + 1; //左孩子
        while (left < size) { //左孩子不越界
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left; //left + 1 右孩子，右孩子也不越界，并且右孩子比左孩子大，较大的数，就是右孩子所在的位置
            //右孩子不越界，右孩子比左孩子大，哪个大，谁的下标就算largest
            largest = arr[largest] > arr[index] ? largest : index; //最大和Index比较 上面找到孩子中最大的数和当前父亲（当前节点）比较
            if (largest == index) { //如果当前（父节点）最大  就不往下沉了
                break;
            }
            swap(arr, largest, index); //当前的数和左右孩子较大的数
            index = largest; //当前节点调整为较大的数的位置
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
