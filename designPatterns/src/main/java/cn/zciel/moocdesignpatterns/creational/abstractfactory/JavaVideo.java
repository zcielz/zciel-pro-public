package cn.zciel.moocdesignpatterns.creational.abstractfactory;

/**
 * @author YINZHEN
 * @date 2019/3/1 10:06
 * @Description
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("video");
    }
}
