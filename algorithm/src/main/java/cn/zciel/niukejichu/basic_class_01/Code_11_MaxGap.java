package cn.zciel.niukejichu.basic_class_01;

import java.util.Arrays;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

/**
 * @author YINZHEN
 * @date 2019/2/27 15:52
 * @Description Calculate the maximum interval between each number
 */
public class Code_11_MaxGap {

    public static int maxGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        //数组的长度
        int len = nums.length;
        //初始化最大最小值
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if (min == max) { //当只有一个数的时候
            return 0;
        }
        //可以理解三个桶，第一个桶装是否有值的标记，第二个桶用来装这个桶里面的最大的值，第三个桶装这个桶里面最小的值
        boolean[] hasNum = new boolean[len + 1]; //用来装是否有值的标记
        int[] maxs = new int[len + 1]; //记录范围里面最大值
        int[] mins = new int[len + 1]; //记录范围里面最小值
        int bid = 0;
        for (int i = 0; i < len; i++) { //遍历
            //让数值放入桶中
            bid = bucket(nums[i], len, min, max);//确定当前数组的值是在哪个位置中（哪个桶中）
            //确定桶中最小的信息
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
            //确定桶中最大的信息
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
            //哪个桶最大的信息
            hasNum[bid] = true; //标记那个桶有值
        }
        int res = 0;
        int lastMax = maxs[0]; //0位置桶的最大值
        int i = 1; //从1位置开始 最小值减去最大值
        for (; i <= len; i++) {
            //找到每个非空的桶，找到左边离他最近的非空桶，用当前的最小减去前一个最大
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    private static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min)); //直接生成桶的位置
    }

    // for test
    public static int comparator(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int gap = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            gap = Math.max(nums[i] - nums[i - 1], gap);
        }
        return gap;
    }

    // for test
    public static void main(String[] args) {
        int[] arr1 = generateRandomArray(maxSize, maxValue);
        System.out.println(Arrays.toString(arr1));
        int result = maxGap(arr1);
        System.out.println(result);
    }


}
