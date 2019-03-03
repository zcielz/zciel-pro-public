package cn.zciel.moocdesignpatterns.creational.simplefactory;

/**
 * @author YINZHEN
 * @date 2019/3/1 11:25
 * @Description
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("python");
    }
}
