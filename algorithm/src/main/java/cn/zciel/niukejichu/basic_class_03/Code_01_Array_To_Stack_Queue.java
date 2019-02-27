package cn.zciel.niukejichu.basic_class_03;

import java.lang.reflect.Array;

/**
 * @author YINZHEN
 * @date 2019/2/27 18:28
 * @Description array to stack queue
 */
public class Code_01_Array_To_Stack_Queue { //实现栈

    public static class ArrayStack {
        private Integer[] arr;
        private Integer size;

        //构造函数构造数组
        public ArrayStack(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("The init size is less then 0");
            }
            arr = new Integer[initSize];
            size = 0;
        }

        //查看将要出栈的元素
        public Integer peek() {
            if (size == 0) {
                return null;
            }
            return arr[size - 1];
        }

        //压栈
        public void push(int obj) {
            if (size == arr.length) {
                throw new ArrayIndexOutOfBoundsException("The queue is full");
            }
            arr[size++] = obj;
        }

        //出栈
        public Integer pop() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("The queue is empty");
            }
            return arr[--size];
        }
    }

    public static class ArrayQueue {  //实现队列
        private Integer[] arr;
        private Integer size;  //约束first 和 last 的行为
        private Integer first; //开始位置
        private Integer last;  //结束位置

        private ArrayQueue(int initSize) {
            if (initSize < 0) {
                throw new IllegalArgumentException("the init size is less then 0, error");
            }
            arr = new Integer[initSize];
            size = 0;
            first = 0;
            last = 0;
        }

        public Integer peek() {
            if (size == 0) {
                return null;
            }
            return arr[first];
        }

        public void push(int obj) {
            if (size == arr.length) {
                throw new ArrayIndexOutOfBoundsException("the queue is full");
            }
            size++;
            arr[last] = obj;
            last = last == arr.length - 1 ? 0 : last + 1; //如果end到达了最后一个位置调回到0，如果没有就++
        }

        public Integer poll() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException("the queue is empty");
            }
            size--;
            int tmp = first;
            first = first == arr.length - 1 ? 0 : first + 1; //同上返回
            return arr[tmp];
        }

        public static void main(String[] args) {

        }


    }


}
