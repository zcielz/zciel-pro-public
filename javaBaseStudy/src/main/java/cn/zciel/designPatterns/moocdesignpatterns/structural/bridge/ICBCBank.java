package cn.zciel.designPatterns.moocdesignpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 9:18
 * @Description
 */
@Slf4j
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        log.info("打开icbc账号");
        account.openAccount();
        return account;
    }
}
