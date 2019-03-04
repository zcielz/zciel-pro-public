package cn.zciel.effectiveJava.bookSecondEdition.chapter01;

/**
 * @author YINZHEN
 * @date 2019/2/25 10:50
 * @Description static factory method alternative construction method
 */
public class Demo01 {

    //获取实例除了共有的构造方法，还可以提供一个公有的静态方法，返回实例的静态方法
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
    //静态工厂方法的优点，不像构造方法，他们是有名字的
    //与构造方法不同个，它们不需要每次调用时都创建一个新对象
    //与构造方法不同，他们可以返回其类型的任何子类型的对象
    //返回对象的泪可以根据输入参数的不同而不同
    //在编写包含该方法的类时，返回的对象的类不需要存在

    //只提供静态工厂方法的主要限制是，没有公共或受保护构造方法的类不能被子类化


}
