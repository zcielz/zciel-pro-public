package cn.zciel.designPatterns.moocdesignpatterns.behaviroal.strategy;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:35
 * @Description
 */
public class BeijinPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("..02");
    }
}
