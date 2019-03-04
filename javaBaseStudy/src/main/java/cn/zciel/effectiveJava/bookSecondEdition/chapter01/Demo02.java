package cn.zciel.effectiveJava.bookSecondEdition.chapter01;

import lombok.Data;

/**
 * @author YINZHEN
 * @date 2019/2/25 11:23
 * @Description 静态工厂方法替构造方法
 * 参考： https://www.cnblogs.com/chenpi/p/5981084.html
 */
@Data
public class Demo02 {

    /**
     * 假设我们需要写一个产生随即数的类RandomIntGenerator，该类有两个成员属性：最小值min和最大值max，
     * <p>
     * 假设我们的需求是需要创建三种类型的RandomIntGenerator对象，
     * <p>
     * 1、大于min，小于max；
     * <p>
     * 2、大于min 小于Integer.MAX_VALUE；
     * <p>
     * 3、大于Integer.MIN_VALUE 小于max
     */
    //对于使用构造函数直接传值，注意只穿一个值的时候，重载会有冲突

    //使用静态工厂方法替代构造方法
    private int min = Integer.MIN_VALUE;

    private int max = Integer.MAX_VALUE;

    public Demo02(int min, int max) {
        this.min = min;
        this.max = max;
    }

    //大于Min,小于max
    public static Demo02 between(int min, int max) {
        return new Demo02(min, max);
    }

    //大于MIN_VALUE,小于max
    public static Demo02 biggerThan(int min) {
        return new Demo02(min, Integer.MAX_VALUE);
    }

    //小于MAX_VALUE,大于min
    public static Demo02 smallerThan(int max) {
        return new Demo02(Integer.MIN_VALUE, max);
    }

}
