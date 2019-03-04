package cn.zciel.designPatterns.moocdesignpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:35
 * @Description
 */
@Slf4j
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统的对接逻辑
        log.info(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
