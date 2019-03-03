package cn.zciel.moocdesignpatterns.structural.adapter.objectadapter;

/**
 * @author YINZHEN
 * @date 2019/3/1 14:08
 * @Description
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //---
        adaptee.adapteeRequest();
        //---
    }
}
