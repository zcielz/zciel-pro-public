package cn.zciel.moocdesignpatterns.creational.abstractfactory;

/**
 * @author YINZHEN
 * @date 2019/3/1 10:06
 * @Description
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
