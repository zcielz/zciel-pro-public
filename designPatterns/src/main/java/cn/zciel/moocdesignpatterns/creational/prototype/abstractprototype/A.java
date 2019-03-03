package cn.zciel.moocdesignpatterns.creational.prototype.abstractprototype;

/**
 * @author YINZHEN
 * @date 2019/3/1 11:15
 * @Description
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
