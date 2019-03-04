package cn.zciel.designPatterns.moocdesignpatterns.creational.build;


/**
 * @author YINZHEN
 * @date 2019/3/1 10:12
 * @Description
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
