package cn.zciel.niukejichu.basic_class_03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author YINZHEN
 * @date 2019/2/28 9:58
 * @Description stack-> queue; queue-> stack
 */
public class Code_03_StackAndQueueConvert {

    /**
     * stack -> queue
     */
    public static class TwoStacksQueue {
        private Stack<Integer> stackPush;

        private Stack<Integer> stackPop;

        //初始化两个栈
        public TwoStacksQueue() {
            stackPush = new Stack<Integer>();
            stackPop = new Stack<Integer>();
        }

        //堆栈
        public void push(int pushInt) {
            stackPush.push(pushInt);
        }

        //出栈  --> 出队结构
        public int poll() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty");
            } else if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());//将push栈 转入 pop栈
                }
            }
            return stackPop.pop(); //pop栈最上面一个就是出队的
        }
    }

    /**
     * Queues --> stack
     */
    public static class TwoQueuesStack {
        private Queue<Integer> queue;
        private Queue<Integer> help;

        public TwoQueuesStack() {
            queue = new LinkedList<Integer>();
            help = new LinkedList<Integer>();
        }

        public void push(int pushInt) {
            queue.add(pushInt);
        }

        public int peek() {
            if (queue.isEmpty()) {
                throw new RuntimeException("stack is empty");
            }
            while (queue.size() != 1) {
                help.add(queue.poll()); //辅助数组添加队列头部
            }
            int res = queue.poll();//将最后一个为栈的pop的位置
            help.add(res); //还是添加进入
            swap();
            return res;
        }

        public int pop() {
            if (queue.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            while (queue.size() > 1) {
                help.add(queue.poll());
            }
            int res = queue.poll();
            swap();
            return res;
        }

        /**
         * 将help栈和queue栈交换位置
         */
        private void swap() {
            Queue<Integer> tmp = help;
            help = queue;
            queue = tmp;
        }
    }
}
