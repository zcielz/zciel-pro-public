package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v1;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:14
 * @Description
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
