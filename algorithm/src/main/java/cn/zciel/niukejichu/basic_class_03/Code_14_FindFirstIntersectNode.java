package cn.zciel.niukejichu.basic_class_03;

/**
 * 两个单链表相交问题：3种情况 1.都是无环 2.一个有环一个无环 3.都是有环
 * <p>
 * //情况1 两个无环链表
 * //判断两个单链表有环无环的方法，方式1，保存到hash表的key，如果有重复的就表示有环，hashSet
 * //方式2不用hash表，一个是快指针2步，一个慢指针，如果快指针走到为Null了直接无环。否则有环。如果有环，快指针一定和慢指针相遇。
 * //loop1 为null  loop2为null 可以用loop1放map中 如果loop2中一个个去找 如果有就相交否则就不相交
 * //loop1 为null  loop2为null 不用Map, loop1 和 loop2 统计他们的长度，先遍历链表1，统计链表1的长度已经最后结果值，获取链表2 也那两个值，
 * 先判断end1和end2的内存地址是否相等，是否是一个节点，如果end1 != end2说明不可能相交，如果等于就相交 ，也许不是第一个相交的结点。
 * 这个时候用len1 - len2 让 loop1先走这么多 然后一起走，然后一定会走到相交的结点处。
 * <p>
 * //情况2  一个有环链表，一个无环链表
 * 不可能相交 因为是单链表结构
 * <p>
 * //情况3 两个有环链表
 * 1）各自成环 不相交
 * <p>
 * 2） 两个共享一个环  只有一个共同的结点
 * 如果loop1的内存地址和loop2的内存地址一样就是这种结构。
 * <p>
 * 3)两个共享一个环 有两个共同结点
 * 如果loop1!= loop2可能是结构1，或者结构3，然loop1继续往下走，如果loop1转到了自己还没遇到loop2
 * 说明是第一种 如果遇到了就是第三种 可以看第二个图
 * <p>
 * {@link static/img/basic_class_03/Code_14_FindFirstIntersectNode/Snipaste_2019-03-02_18-12-11.png}
 */
public class Code_14_FindFirstIntersectNode {

    //单链表结构
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    /**
     * 获取实例
     *
     * @param head1
     * @param head2
     * @return
     */
    public static Node getIntersectNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node loop1 = getLoopNode(head1); //得到链表第一个入环的结点
        Node loop2 = getLoopNode(head2);
        if (loop1 == null && loop2 == null) { //如果这两个链表都是无环链表
            return noLoop(head1, head2); //两个无环链表的问题
        }
        if (loop1 != null && loop2 != null) { //两个有环链表相交的问题
            return bothLoop(head1, loop1, head2, loop2);
        }
        return null; //如果两个链表中一个有环 一个无环 一定不相交
    }

    /**
     * 两个有环链表相交的问题
     *
     * @param head1
     * @param loop1 相交的结点
     * @param head2
     * @param loop2 相交的结点
     * @return
     */
    private static Node bothLoop(Node head1, Node loop1, Node head2, Node loop2) {
        Node cur1 = null;
        Node cur2 = null;
        if (loop1 == loop2) { //这两个相等就是图中的第二种 都在一个环上 一个结点的的环相交
            cur1 = head1;
            cur2 = head2;
            int n = 0;
            while (cur1 != loop1) { //如果初始结点不等于环的结点
                n++;
                cur1 = cur1.next;//走到那个环的结点处
            }
            while (cur2 != loop2) {
                n--;
                cur2 = cur2.next;
            }
            //逻辑同上 找到两个到结点的最短距离
            cur1 = n > 0 ? head1 : head2;
            cur2 = cur1 == head1 ? head2 : head1;
            n = Math.abs(n);
            while (n != 0) { //如果n 不等于0 ，就递减
                n--;
                cur1 = cur1.next;
            }
            //两个结点一起走 走到相等的时候就是那个相遇的结点
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        } else {  //两种情况：//图中情况1 两个不相交 或者情况3  两个相交 两个结点
            cur1 = loop1.next;
            while (cur1 != loop1) { //loop1在转 如果遇到loop2就相交
                if (cur1 == loop2) {
                    return loop1; //这个就是相交的结点
                }
                cur1 = cur1.next;
            }
            return null; //这两个环不相交
        }
    }

    /**
     * 两个无环的链表
     *
     * @param head1
     * @param head2
     * @return
     */
    private static Node noLoop(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node cur1 = head1;
        Node cur2 = head2;
        int n = 0; //n代表两个链表的长度差值的关系
        while (cur1.next != null) { //cur1不断往下走
            n++;
            cur1 = cur1.next;
        }
        while (cur2.next != null) { //找到链表最后一个结点
            n--;
            cur2 = cur2.next;
        }
        if (cur1 != cur2) { //如果两个最后的结点不相等 就不可能相交
            return null;
        }
        //定位谁是长链表 谁是短链表
        cur1 = n > 0 ? head1 : head2; //长链表 取出长链表
        cur2 = cur1 == head1 ? head2 : head1; //根据上买的情况 如果去的是第一个链表 就取另外一个链表（短链表 ）
        n = Math.abs(n); //取出他们的差值
        while (n != 0) { //说明链表长度不一样 长的先走
            n--;
            cur1 = cur1.next;
        }
        //让长链表走到这个长度后 两个链表一起走
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1; //刚刚相遇的地方是最初交接的结点
    }

    /**
     * 得到入环的结点
     *
     * @param head
     * @return
     */
    private static Node getLoopNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) { //这个链表为空的时候
            return null;
        }
        Node n1 = head.next;//n1 -> slow 慢指针 一次走一步的
        Node n2 = head.next.next; //n2 -> fast 快指针 一次走两步的
        while (n1 != n2) { //当两个链表相交的时候（位置到相同的位置的时候）
            if (n2.next == null || n2.next.next == null) { //如果快指针提前结尾了 就返回空，不可能有环
                return null;
            }
            //继续往后移动
            n2 = n2.next.next;
            n1 = n1.next;
        }
        //这个时候两个都相遇了 让快指针回到开头
        n2 = head; //n2 -> walk again from head
        while (n1 != n2) {//让两个指针都只走一步，当两个指针再次相交的时候，这个地方就是入环的结点
            n1 = n1.next;
            n2 = n2.next;
        }
        return n1;
    }

    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->null
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);

        // 0->9->8->6->7->null
        Node head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectNode(head1, head2).value);

        // 1->2->3->4->5->6->7->4...
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next = head1.next.next.next; // 7->4

        // 0->9->8->2...
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next; // 8->2
        System.out.println(getIntersectNode(head1, head2).value);

        // 0->9->8->6->4->5->6..
        head2 = new Node(0);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectNode(head1, head2).value);

    }


}
