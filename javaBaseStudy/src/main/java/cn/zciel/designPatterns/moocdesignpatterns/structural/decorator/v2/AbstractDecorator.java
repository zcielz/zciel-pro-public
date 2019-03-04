package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v2;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:21
 * @Description
 */
public abstract class AbstractDecorator extends ABattercake {

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}

