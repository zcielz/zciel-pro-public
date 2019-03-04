package cn.zciel.designPatterns.selfStudy.iterator.demo01;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:12
 * @Description 定义容器角色（Aggregate)
 * 一般是一个接口，提供一个iterator()方法，例如java中的Collection接口，List接口，Set接口等
 */
public interface List {

    void add(Object obj);

    Object get(int index);

    Iterator iterator();

    int getSize();

}
