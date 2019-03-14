package cn.zciel.designPatterns.moocdesignpatterns.principle.dependenceinversion;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:35
 * @Description
 */
public class Geely {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
