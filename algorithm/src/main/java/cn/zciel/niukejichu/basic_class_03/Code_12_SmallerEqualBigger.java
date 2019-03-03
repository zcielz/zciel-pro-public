package cn.zciel.niukejichu.basic_class_03;

import static cn.zciel.niukejichu.utils.CodeUtils.*;

/**
 * 将单链表值划分成左边小，中间相等，右边大，比较简单的方法放到数组，然后用荷兰国旗问题解决，但空间+1而且不稳定
 */
public class Code_12_SmallerEqualBigger {

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    //第一种方式:使用荷兰国旗问题
    public static Node listPartition1(Node head, int pivot) {  //head传入的结点 pivot分割的数

        if (head == null) {
            return head;
        }
        Node cur = head; //当前结点
        int i = 0;
        while (cur != null) { //当前结点不为空 这里就是为了计算长度给下面生成node数组使用
            i++;    //这里就是为了计算长度
            cur = cur.next;
        }
        Node[] nodeArr = new Node[i];
        i = 0;
        cur = head; //当前结点指向head
        for (i = 0; i != nodeArr.length; i++) {
            nodeArr[i] = cur; //结点添加到数组中
            cur = cur.next; //遍历当前结点
        }
        arrPartition(nodeArr, pivot); //对整个数据都 左边  中间 右边排序
        for (i = 1; i != nodeArr.length; i++) {
            nodeArr[i - 1].next = nodeArr[i]; //变成链表结构
        }
        nodeArr[i - 1].next = null;
        return nodeArr[0];

    }

    private static void arrPartition(Node[] nodeArr, int pivot) {
        int small = -1;
        int big = nodeArr.length;
        int index = 0;
        while (index != big) { //边界
            if (nodeArr[index].value < pivot) { //如果这个数小于pivot指定的数，就让小的数在前面
                swap(nodeArr, ++small, index++);
            } else if (nodeArr[index].value == pivot) { //如果相等，只是增加标志位
                index++;
            } else {
                swap(nodeArr, --big, index);
            }
        }
    }

    public static void swap(Node[] nodeArr, int a, int b) {
        Node tmp = nodeArr[a];
        nodeArr[a] = nodeArr[b];
        nodeArr[b] = tmp;
    }

    //链表第二种方式:思想 创建是是三个链表 分别头结点 尾结点
    //如果大于指定的数 放在第一个 ，等于 放在第二个...\
    //最后通过逻辑串起来
    public static Node listPartition2(Node head, int pivot) {
        Node sH = null; // small head
        Node sT = null; // small tail
        Node eH = null; // equal head
        Node eT = null; // equal tail
        Node bH = null; // big head
        Node bT = null; // big tail
        Node next = null; // save next node
        // every node distributed to three lists
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.value < pivot) { //如果当前结点小于链表
                if (sH == null) { //这是小链表的部分
                    sH = head;
                    sT = head;
                } else {
                    sT.next = head;
                    sT = head;
                }
            } else if (head.value == pivot) {
                if (eH == null) {
                    eH = head;
                    eT = head;
                } else {
                    eT.next = head;
                    eT = head;
                }
            } else {
                if (bH == null) {
                    bH = head;
                    bT = head;
                } else {
                    bT.next = head;
                    bT = head;
                }
            }
            head = next;
        }
        //small and equal reconnect
        if (sT != null) { //
            sT.next = eH; //sT的下一个 是相等的部分
            eT = eT == null ? sT : eT; //如果相等的尾结点尾Null的话，说明eT没有值，直接eT
        }
        //all reconnect
        if (eT != null) {
            eT.next = bH;
        }
        return sH != null ? sH : eH != null ? eH : bH;
    }

    public static void printLinkedList(Node node) {
        System.out.print("Linked List: ");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(9);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next = new Node(5);
        printLinkedList(head1);
        //head1 = listPartition1(head1, 5);
        head1 = listPartition2(head1, 5);
        printLinkedList(head1);

    }


}
