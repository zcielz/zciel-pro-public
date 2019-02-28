package cn.zciel.moocdesignpatterns.behaviroal.strategy;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:36
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new BeijinPromotionStrategy());
        promotionActivity.executePromotionStrategy();
    }
}
