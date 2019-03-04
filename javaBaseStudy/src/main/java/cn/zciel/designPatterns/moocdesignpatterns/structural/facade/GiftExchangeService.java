package cn.zciel.designPatterns.moocdesignpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:37
 * @Description
 */
@Slf4j
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchagne(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            //资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                //支付成功后
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                log.info("物流订单下单成功，订单号是:" + shippingOrderNo);
            }
        }
    }
}
