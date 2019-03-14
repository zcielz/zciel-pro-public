package cn.zciel.designPatterns.moocdesignpatterns.principle.dependenceinversion;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:35
 * @Description
 */
public class Test {
    public static void main(String[] args) {

        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();
    }
}
