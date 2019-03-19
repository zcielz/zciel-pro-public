package cn.zciel.java.reflex.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author YINZHEN
 * @date 2019/3/19 16:11
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private String name;

    private Integer id;

    private boolean gender;

    private Date birthdya;

    private int score;

}
