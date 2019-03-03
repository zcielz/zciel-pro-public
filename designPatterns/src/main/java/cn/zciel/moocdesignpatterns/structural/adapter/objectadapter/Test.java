package cn.zciel.moocdesignpatterns.structural.adapter.objectadapter;

public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        System.out.println(".........");
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
