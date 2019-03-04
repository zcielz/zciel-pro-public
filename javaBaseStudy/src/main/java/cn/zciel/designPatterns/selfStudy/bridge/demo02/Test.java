package cn.zciel.designPatterns.selfStudy.bridge.demo02;

/**
 * @author YINZHEN
 * @date 2019/3/4 15:28
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        //d1和d2都是使用默认的display方法
        Display d1 = new Display(new StringDisplayImpl("hello world"));
        d1.display();
        Display d2 = new CountDisplay(new StringDisplayImpl("hello king"));
        d2.display();

        //d3使用的是扩展出来的multiDisplay方法，因为方法是不能找到子类专属方法，所以这里没有采用多态的方式
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello moon"));
        d3.display();
        d3.multiDisplay(3);
    }
}
