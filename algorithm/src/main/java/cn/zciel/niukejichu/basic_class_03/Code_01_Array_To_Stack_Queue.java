package cn.zciel.niukejichu.basic_class_03;

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
        private Integer size;
        private Integer first;
        private Integer last;


    }


}
