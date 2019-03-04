package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:15
 * @Description
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        log.info(battercake.getDesc() + "销售价格：" + battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        log.info(battercakeWithEgg.getDesc() + "销售价格:" + battercakeWithEgg.cost());

        Battercake battercakeWithEggSauage = new BattercakeWithEggSausage();
        log.info(battercakeWithEggSauage.getDesc() + " 销售价格:" + battercakeWithEggSauage.cost());
    }

}
