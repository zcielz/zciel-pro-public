package cn.zciel.designPatterns.selfStudy.bridge.demo01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 13:53
 * @Description
 */
@Slf4j
public class EmainSendMsg implements SendMsgInterface {
    @Override
    public void sendMsg() {
        log.info("email 发送");
    }
}
