package cn.zciel.designPatterns.moocdesignpatterns.structural.adapter.classadapter;

/**
 * @author YINZHEN
 * @date 2019/3/1 13:55
 * @Description
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
