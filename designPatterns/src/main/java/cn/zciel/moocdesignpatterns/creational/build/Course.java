package cn.zciel.moocdesignpatterns.creational.build;

import lombok.Data;
import lombok.ToString;

/**
 * @author YINZHEN
 * @date 2019/3/1 10:16
 * @Description
 */
@Data
@ToString
public class Course {

    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    private String courseQA;
}
