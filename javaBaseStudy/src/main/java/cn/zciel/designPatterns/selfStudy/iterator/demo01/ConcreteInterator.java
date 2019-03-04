package cn.zciel.designPatterns.selfStudy.iterator.demo01;


/**
 * @author YINZHEN
 * @date 2019/2/27 19:08
 * @Description 具体迭代器角色(Concrete Iterator)
 * <p>
 * 实现迭代器接口中定义的方法，完成集合的迭代。
 * refer：https://www.cnblogs.com/ysw-go/p/5384516.html
 */
public class ConcreteInterator implements Iterator {

    private List list = null;
    private int index;

    public ConcreteInterator(List list) {
        super();
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index >= list.getSize()) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }
}
