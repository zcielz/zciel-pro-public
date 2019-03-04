package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:26
 * @Description
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;

        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        log.info(aBattercake.getDesc() + " 销售价格:" + aBattercake.cost());

    }
}
