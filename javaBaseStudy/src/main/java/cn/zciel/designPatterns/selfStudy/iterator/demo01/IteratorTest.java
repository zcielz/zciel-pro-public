package cn.zciel.designPatterns.selfStudy.iterator.demo01;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:29
 * @Description
 */
public class IteratorTest {

    public static void main(String[] args) {
        List list = new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
