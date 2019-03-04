package cn.zciel.designPatterns.moocdesignpatterns.structural.facade;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:37
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("Tshit");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchagne(pointsGift);
    }
}
