package cn.zciel.moocdesignpatterns.creational.simplefactory;

/**
 * @author YINZHEN
 * @date 2019/3/1 11:25
 * @Description
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("java");
    }
}
