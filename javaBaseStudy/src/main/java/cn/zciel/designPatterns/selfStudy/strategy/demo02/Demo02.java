package cn.zciel.designPatterns.selfStudy.strategy.demo02;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:25
 * @Description 客户端
 */
public class Demo02 {

    public static void main(String[] args) {

        ShareContext context = (ShareContext) ShareContext.getShareTarget(1);
        System.out.println(context.showContent());
        System.out.println(context.showTitle());
        System.out.println(context.displayImageUrl("aa", "bb"));
        System.out.println(context.displayImageUrl("ss", "dd"));
    }
}
