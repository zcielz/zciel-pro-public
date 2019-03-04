package cn.zciel.designPatterns.moocdesignpatterns.creational.prototype;

import lombok.Data;
import lombok.ToString;

/**
 * @author YINZHEN
 * @date 2019/3/1 11:04
 * @Description
 */
@Data
@ToString
public class Mail implements Cloneable {
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
