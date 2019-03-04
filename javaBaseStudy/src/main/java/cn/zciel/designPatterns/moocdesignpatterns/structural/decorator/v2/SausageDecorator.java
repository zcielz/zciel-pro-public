package cn.zciel.designPatterns.moocdesignpatterns.structural.decorator.v2;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:24
 * @Description
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
