package cn.zciel.designPatterns.selfStudy.bridge.demo01;

/**
 * @author YINZHEN
 * @date 2019/3/4 13:52
 * @Description 信息类型的抽象类
 */
public abstract class Msg {

    private SendMsgInterface smi;

    public Msg(SendMsgInterface smi) {
        this.smi = smi;
    }

    public abstract void send();
}
