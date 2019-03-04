package cn.zciel.designPatterns.selfStudy.bridge.demo01;

/**
 * @author YINZHEN
 * @date 2019/3/4 14:00
 * @Description
 */
public class BridgeTest {
    public static void main(String[] args) {
        SendMsgInterface smdSendMsg = new SmsSendMsg();
        Msg importantMsg = new ImportantMsg(smdSendMsg);
        importantMsg.send();
    }
}
