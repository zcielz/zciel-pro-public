package cn.zciel.designPatterns.moocdesignpatterns.structural.bridge;

/**
 * @author YINZHEN
 * @date 2019/3/4 9:12
 * @Description
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();

}
