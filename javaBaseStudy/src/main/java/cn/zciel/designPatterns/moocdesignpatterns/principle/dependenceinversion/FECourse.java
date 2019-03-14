package cn.zciel.designPatterns.moocdesignpatterns.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:34
 * @Description
 */
@Slf4j
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        log.info("Geely在学习FE");
    }
}
