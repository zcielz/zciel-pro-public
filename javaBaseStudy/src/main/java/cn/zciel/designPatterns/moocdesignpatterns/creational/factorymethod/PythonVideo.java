package cn.zciel.designPatterns.moocdesignpatterns.creational.factorymethod;

/**
 * @author YINZHEN
 * @date 2019/3/1 10:49
 * @Description
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("python");
    }
}
