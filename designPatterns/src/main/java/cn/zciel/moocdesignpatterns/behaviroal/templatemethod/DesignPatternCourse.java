package cn.zciel.moocdesignpatterns.behaviroal.templatemethod;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:41
 * @Description
 */
public class DesignPatternCourse extends ACourse {
    @Override
    protected boolean needWriteAricle() {
        return true;
    }

    @Override
    void packageCourse() {
        System.out.println("java");
    }
}
