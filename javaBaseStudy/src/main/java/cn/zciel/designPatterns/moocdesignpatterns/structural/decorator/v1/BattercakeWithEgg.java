package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v1;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:13
 * @Description
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
