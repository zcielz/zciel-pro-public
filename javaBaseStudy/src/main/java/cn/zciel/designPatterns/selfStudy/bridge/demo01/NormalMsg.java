package cn.zciel.designPatterns.selfStudy.bridge.demo01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 14:00
 * @Description
 */
@Slf4j
public class NormalMsg extends Msg {
    public NormalMsg(SendMsgInterface smi) {
        super(smi);
    }

    @Override
    public void send() {
        log.info("普通的信息");
    }
}
