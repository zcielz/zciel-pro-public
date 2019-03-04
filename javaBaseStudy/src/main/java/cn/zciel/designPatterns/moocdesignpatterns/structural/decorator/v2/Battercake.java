package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v2;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:23
 * @Description
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "葱饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
