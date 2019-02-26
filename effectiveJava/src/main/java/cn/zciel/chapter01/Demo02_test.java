package cn.zciel.chapter01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/2/25 11:32
 * @Description demo02 test
 */
@Slf4j
public class Demo02_test {

    public static void main(String[] args) {
        //调用Demo02的时候，不需要创建对象了
        Demo02 between = Demo02.between(1, 2);
        log.info(String.valueOf(between.getMax()));
        log.info(String.valueOf(between.getMin()));
    }
}
