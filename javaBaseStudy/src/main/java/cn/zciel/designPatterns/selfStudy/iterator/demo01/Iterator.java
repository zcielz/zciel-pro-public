package cn.zciel.designPatterns.selfStudy.iterator.demo01;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:05
 * @Description 迭代器角色(Iterator)
 * 迭代器模式（Iterator），提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
 * 迭代器角色：定义遍历元素所需要的方法，一般有三个方法：
 * 1）取得下一个元素的方法next()
 * 2）判断是否遍历结束的方法hasNext()
 * 3) 移除当前对象的方法remove()
 */
public interface Iterator {

    boolean hasNext();

    Object next();
}
