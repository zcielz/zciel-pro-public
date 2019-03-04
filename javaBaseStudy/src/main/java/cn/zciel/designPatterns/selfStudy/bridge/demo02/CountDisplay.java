package cn.zciel.designPatterns.selfStudy.bridge.demo02;

/**
 * @author YINZHEN
 * @date 2019/3/4 15:15
 * @Description
 */
public class CountDisplay extends Display {

    /**
     * 利用构造，传参，与父类相同
     *
     * @param impl
     */
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
