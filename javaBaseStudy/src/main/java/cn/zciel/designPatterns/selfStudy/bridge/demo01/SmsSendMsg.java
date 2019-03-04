package cn.zciel.designPatterns.selfStudy.bridge.demo01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 13:54
 * @Description sms发送
 */
@Slf4j
public class SmsSendMsg implements SendMsgInterface {
    @Override
    public void sendMsg() {
        log.info("sms 方式发送");
    }
}
