package cn.zciel.designPatterns.moocdesignpatterns.behaviroal.iterator;

import java.util.List;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:51
 * @Description
 */
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;

    private int position;

    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }


    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是:" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courseList.size()) {
            return false;
        }
        return true;
    }
}
