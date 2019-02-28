package cn.zciel.moocdesignpatterns.behaviroal.templatemethod;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:44
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        /*ACourse aCourse = new DesignPatternCourse();
        aCourse.makeCourse();*/

        ACourse aCourse = new FECourse(false);
        aCourse.makeCourse();
    }

}
