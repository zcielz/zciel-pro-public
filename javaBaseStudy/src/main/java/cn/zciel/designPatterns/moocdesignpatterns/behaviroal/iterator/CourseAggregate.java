package cn.zciel.designPatterns.moocdesignpatterns.behaviroal.iterator;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:47
 * @Description
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
