package cn.zciel.designPatterns.selfStudy.bridge.demo02;

/**
 * @author YINZHEN
 * @date 2019/3/4 14:43
 * @Description
 */
public class Display {

    /**
     * 准备一个属性，并且在构造Display类的时候将具体实现接口的类进行传入
     */
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    /**
     * 扩展
     */
    public final void display() {
        open();
        print();
        close();
    }

}
