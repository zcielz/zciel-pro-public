package cn.zciel.designPatterns.moocdesignpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 9:16
 * @Description
 */
@Slf4j
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        log.info("打开a账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        log.info("这是一个a账号");
    }
}
