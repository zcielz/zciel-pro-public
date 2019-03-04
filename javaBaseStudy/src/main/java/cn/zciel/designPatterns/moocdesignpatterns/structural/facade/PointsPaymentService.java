package cn.zciel.designPatterns.moocdesignpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:32
 * @Description
 */
@Slf4j
public class PointsPaymentService {
    public boolean pay(PointsGift pointGift) {
        //扣减积分
        log.info("支付" + pointGift.getName() + " 积分成功");
        return true;
    }
}
