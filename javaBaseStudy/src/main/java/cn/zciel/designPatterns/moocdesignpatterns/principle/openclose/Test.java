package cn.zciel.designPatterns.moocdesignpatterns.principle.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:42
 * @Description
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(99, "zz", 23d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        log.info("课程id: {} + 课程价格: {}", javaDiscountCourse.getName(), javaDiscountCourse.getDiscountPrice());
    }
}
