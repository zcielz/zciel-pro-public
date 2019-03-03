package cn.zciel.niukejichu.basic_class_03;

import java.util.HashMap;

/**
 * 拷贝链表的结构
 * 结构可能A -> B -> C  A -> C A ->D  类似图 {@link static/img/basic_class_03/Code_13_CopyListWithRandom/Snipaste_2019-03-02_14-56-35.png}
 * rand部分{@link static/img/basic_class_03/Code_13_CopyListWithRandom/Snipaste_2019-03-02_15-05-53.png}
 */
public class Code_13_CopyListWithRandom {
    //TODO curCopy作用
    public static class Node {
        public int value;
        public Node next;
        public Node rand;

        public Node(int data) {
            this.value = data;
        }
    }


    //通过hash表 1->2 1` -> 2`
    public static Node copyListWithRand1(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head; //位于头结点
        while (cur != null) { //第一次遍历 生成拷贝结点
            map.put(cur, new Node(cur.value));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) { //直接遍历得到拷贝结点的东西
            map.get(cur).next = map.get(cur.next);
            map.get(cur).rand = map.get(cur.rand);
            cur = cur.next;
        }
        return map.get(head);
    }

    //第二种方式： 直接在尾加点添加1-> 1` -> 2 -> 2` -> ....
    private static Node copyListWithRand2(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head; //头结点
        Node next = null; //下一个
        // copy node and link to every node
        while (cur != null) {
            next = cur.next; //下一个
            cur.next = new Node(cur.value); //在下一个添加 //这个还是相同的值 cur.value
            cur.next.next = next; //拼接下一个的下一个
            cur = next; //cur指向下一个
        }
        cur = head; //又返回了头结点
        Node curCopy = null;
        //set copy node rand  //连上所有的rand结点
        while (cur != null) {
            next = cur.next.next; //next指向下一个
            curCopy = cur.next; //这个是拷贝的结点
            curCopy.rand = cur.rand != null ? cur.rand.next : null; //拷贝的结点rand应该和cur.rand一样
            cur = next;
        }
        Node res = head.next; //这个是拷贝的结点
        cur = head; //头结点
        //split
        while (cur != null) {
            next = cur.next.next; //获取下一个
            curCopy = cur.next; //拷贝的下一个
            cur.next = next; //标准的下一个
            curCopy.next = next != null ? next.next : null; //拷贝原版
            cur = next; //遍历下一个
        }
        return res;
    }


    public static void printRandLinkedList(Node head) {
        Node cur = head;
        System.out.println("order: ");
        while (cur != null) {
            System.out.println(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
        cur = head;
        System.out.println("rand: ");
        while (cur != null) {
            System.out.println(cur.rand == null ? "- " : cur.rand.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node head = null;
        Node res1 = null;
        Node res2 = null;
        printRandLinkedList(head);
        res1 = copyListWithRand1(head);
        printRandLinkedList(res1);
        res2 = copyListWithRand2(head);
        printRandLinkedList(res2);
        printRandLinkedList(head);
        System.out.println("=========================");

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head.rand = head.next.next.next.next.next; // 1 -> 6
        head.next.rand = head.next.next.next.next.next; // 2 -> 6
        head.next.next.rand = head.next.next.next.next; // 3 -> 5
        head.next.next.next.rand = head.next.next; // 4 -> 3
        head.next.next.next.next.rand = null; // 5 -> null
        head.next.next.next.next.next.rand = head.next.next.next; // 6 -> 4

        printRandLinkedList(head);
        res1 = copyListWithRand1(head);
        printRandLinkedList(res1);
        res2 = copyListWithRand2(head);
        printRandLinkedList(res2);
        printRandLinkedList(head);
        System.out.println("=========================");

    }


}
