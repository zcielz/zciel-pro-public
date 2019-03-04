package cn.zciel.designPatterns.moocdesignpatterns.behaviroal.iterator;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:46
 * @Description
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();

}
