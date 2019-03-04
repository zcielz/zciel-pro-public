package cn.zciel.designPatterns.moocdesignpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 9:19
 * @Description
 */
@Slf4j
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        log.info("打开saving账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        log.info("这是一个saving账号");
    }
}
