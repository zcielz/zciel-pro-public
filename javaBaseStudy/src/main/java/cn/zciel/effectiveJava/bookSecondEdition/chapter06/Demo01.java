package cn.zciel.effectiveJava.bookSecondEdition.chapter06;

/**
 * @author YINZHEN
 * @date 2019/2/25 19:20
 * @Description
 */
public class Demo01 {

    //不必要的对象的方法是自动装箱，它允许程序员混用基本类型和包装的基本类型

    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
        // long ----> Long
    }
}
