package cn.zciel.designPatterns.moocdesignpatterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 9:15
 * @Description
 */
@Slf4j
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        log.info("打开abcbank");
        account.openAccount();
        return account;
    }
}
