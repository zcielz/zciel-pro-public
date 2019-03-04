package cn.zciel.designPatterns.moocdesignpatterns.structural.adapter.classadapter;

/**
 * @author YINZHEN
 * @date 2019/3/1 13:56
 * @Description
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //..
    }
}
