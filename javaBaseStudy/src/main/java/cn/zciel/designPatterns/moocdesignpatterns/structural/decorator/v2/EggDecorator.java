package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v2;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:23
 * @Description
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
