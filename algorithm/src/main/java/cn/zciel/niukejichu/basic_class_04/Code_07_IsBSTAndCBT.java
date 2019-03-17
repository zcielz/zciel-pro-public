package cn.zciel.niukejichu.basic_class_04;

import java.util.LinkedList;
import java.util.Queue;

//完全二叉树 和 搜索二叉树
//搜索二叉树 任何一个结点的数 左子树比他小 右子树比他大
public class Code_07_IsBSTAndCBT {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    //搜索二叉树 TODO 这个以后看 初级5-114
    public static boolean isBST(Node head) {
        if (head == null) {
            return true;
        }
        boolean res = true;
        Node pre = null;
        Node cur1 = head;
        Node cur2 = null;
        while (cur1 != null) {
            cur2 = cur1.left;
            if (cur2 != null) {
                while (cur2.right != null && cur2.right != cur1) {
                    cur2 = cur2.right;
                }
                if (cur2.right == null) {
                    cur2.right = cur1;
                    cur1 = cur1.left;
                    continue;
                } else {
                    cur2.right = null;
                }
            }
            if (pre != null && pre.value > cur1.value) {
                res = false;
            }
            pre = cur1;
            cur1 = cur1.right;
        }
        return res;
    }

    //判断完全二叉树
    //情况一 左右孩子都没有节点了
    //情况而 最下面左边有子树 右边这一层都没有子树了
    public static boolean isCBT(Node head) {
        if (head == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<Node>();
        boolean leaf = false;
        Node l = null;
        Node r = null;
        queue.offer(head);
        while (!queue.isEmpty()) {
            head = queue.poll(); //放入队列中
            l = head.left; //左孩子拿到
            r = head.right; //右孩子拿到
            //leaf 开启了叶子结点 (l != null || r != null)左孩子必须为空 右孩子必须为空 否则直接return false;
            if ((leaf && (l != null || r != null)) || (l == null && r != null)) {
                return false;
            }
            if (l != null) {
                queue.offer(l); //先加左孩子
            }
            if (r != null) {
                queue.offer(r); //再加右
            } else { //等价if(l == null || r == null)
                leaf = true;
            }
        }
        return true;
    }

}
