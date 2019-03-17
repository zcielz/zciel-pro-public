package cn.zciel.niukejichu.basic_class_04;

//平衡二叉树 左结点和右结点的差值不超过1  //TODO 没理解
public class Code_06_IsBalancedTree {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isBalance(Node head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(head, 1, res);
        return res[0];
    }

    /**
     * 获取高度
     *
     * @param head
     * @param level
     * @param res
     * @return
     */
    public static int getHeight(Node head, int level, boolean[] res) {
        if (head == null) {
            return level;
        }
        //遍历左结点
        int lH = getHeight(head.left, level + 1, res); //先遍历左结点
        if (!res[0]) {
            return level;
        }
        //遍历右结点
        int rH = getHeight(head.right, level + 1, res); //再遍历右结点
        if (!res[0]) {
            return level;
        }
        //获取两个的高度
        if (Math.abs(lH - rH) > 1) {
            res[0] = false; //如果两个之差大于1的话 设置确认标志位false跳出
        }
        return Math.max(lH, rH);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);

        System.out.println(isBalance(head));

    }


}
