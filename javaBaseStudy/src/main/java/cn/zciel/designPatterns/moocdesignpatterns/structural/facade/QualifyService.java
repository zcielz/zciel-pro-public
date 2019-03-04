package cn.zciel.designPatterns.moocdesignpatterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 18:34
 * @Description
 */
@Slf4j
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        log.info("校验" + pointsGift.getName() + " 的积分规则");
        return true;
    }
}
