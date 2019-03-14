package cn.zciel.designPatterns.moocdesignpatterns.principle.openclose;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:41
 * @Description
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
