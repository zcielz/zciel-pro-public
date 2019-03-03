package cn.zciel.moocdesignpatterns.structural.adapter;

/**
 * @author YINZHEN
 * @date 2019/3/1 13:52
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
