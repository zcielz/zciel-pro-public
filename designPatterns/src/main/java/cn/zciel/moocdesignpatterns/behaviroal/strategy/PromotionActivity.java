package cn.zciel.moocdesignpatterns.behaviroal.strategy;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:35
 * @Description
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }

}
