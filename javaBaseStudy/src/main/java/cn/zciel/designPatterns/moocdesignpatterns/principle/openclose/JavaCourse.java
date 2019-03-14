package cn.zciel.designPatterns.moocdesignpatterns.principle.openclose;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:39
 * @Description
 */
public class JavaCourse implements ICourse {

    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
