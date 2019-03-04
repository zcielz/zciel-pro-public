package cn.zciel.designPatterns.moocdesignpatterns.creational.abstractfactory;

/**
 * @author YINZHEN
 * @date 2019/3/1 10:07
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
