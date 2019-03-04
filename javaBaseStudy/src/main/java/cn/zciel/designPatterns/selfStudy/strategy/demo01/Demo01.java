package cn.zciel.designPatterns.selfStudy.strategy.demo01;

/**
 * @author YINZHEN
 * @date 2019/2/28 13:48
 * @Description 客户端
 * <p>
 * refer:https://www.jianshu.com/p/7b7de81cdfbe
 */
public class Demo01 {

    public static void main(String[] args) {
        //选择使用的策略
        Strategy s = new ConcreteStrategyA();
        Context context = new Context(s);
        context.contextInterface();
    }

    /**
     *策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。
     *
     * 策略模式的优点：
     *    算法可以自由切换；
     *    避免使用多重条件判断；
     *    扩展性良好。
     * 策略模式的缺点：
     *    策略类会增多
     *    所有策略类都需要对外暴露
     * 策略模式的适用场景：
     *    当一个系统中有许多类，它们之间的区别仅在于它们的行为，希望动态地让一个对象在许多行为中选择一种行为时；
     *    当一个系统需要动态地在几种算法中选择一种时；
     *    当一个对象有很多的行为，不想使用多重的条件选择语句来选择使用哪个行为时。
     *
     */
}
