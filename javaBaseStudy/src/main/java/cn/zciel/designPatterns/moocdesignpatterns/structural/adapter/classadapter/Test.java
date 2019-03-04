package cn.zciel.designPatterns.moocdesignpatterns.structural.adapter.classadapter;

/**
 * @author YINZHEN
 * @date 2019/3/1 13:56
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        System.out.println("====");

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}
