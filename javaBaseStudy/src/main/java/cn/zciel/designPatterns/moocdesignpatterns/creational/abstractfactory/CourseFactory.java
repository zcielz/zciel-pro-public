package cn.zciel.designPatterns.moocdesignpatterns.creational.abstractfactory;

/**
 * @author YINZHEN
 * @date 2019/3/1 10:04
 * @Description
 */
public interface CourseFactory {

    Video getVideo();

    Article getArticle();
}
