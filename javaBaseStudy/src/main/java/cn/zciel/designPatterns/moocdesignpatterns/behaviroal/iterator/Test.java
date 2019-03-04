package cn.zciel.designPatterns.moocdesignpatterns.behaviroal.iterator;

/**
 * @author YINZHEN
 * @date 2019/2/27 19:54
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        Course course1 = new Course("java1");
        Course course2 = new Course("java2");

        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);

        System.out.println("--课程列表--");
        printCourse(courseAggregate);

        courseAggregate.removeCourse(course1);
        courseAggregate.removeCourse(course2);

        System.out.println("--删除操作--");
        printCourse(courseAggregate);

    }

    public static void printCourse(CourseAggregate courseAggregate) {
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()) {
            Course course = courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }
}
