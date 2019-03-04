package cn.zciel.designPatterns.selfStudy.strategy.demo01;

/**
 * @author YINZHEN
 * @date 2019/2/28 13:43
 * @Description 环境角色：持有一个strategy的引用
 */
public class Context {

    //持有一个具体策略的对象
    private Strategy strategy;

    //构造函数，传入一个具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface() {
        strategy.algorithemIterface();
    }
}
