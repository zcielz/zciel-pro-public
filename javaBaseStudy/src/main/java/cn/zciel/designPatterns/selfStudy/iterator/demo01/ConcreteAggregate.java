package cn.zciel.designPatterns.selfStudy.iterator.demo01;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:14
 * @Description 具体容器角色（ConcreteAggregate）
 * 就是抽象容器的具体实现类，比如List接口的有序列表实现ArrayList，List接口的链表实现LinkList，Set接口的哈希列表的实现HashSet等。
 */
public class ConcreteAggregate implements List {

    private Object[] list;
    private int size = 0;
    private int index = 0;

    public ConcreteAggregate() {
        index = 0;
        size = 0;
        list = new Object[100];
    }

    @Override
    public void add(Object obj) {
        list[index++] = obj;
        size++;
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteInterator(this);
    }

    @Override
    public int getSize() {
        return size;
    }
}
