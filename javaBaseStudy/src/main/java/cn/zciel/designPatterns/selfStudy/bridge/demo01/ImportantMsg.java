package cn.zciel.designPatterns.selfStudy.bridge.demo01;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 13:55
 * @Description 定义紧急信息和普通信息类
 */
@Slf4j
public class ImportantMsg extends Msg {
    public ImportantMsg(SendMsgInterface smi) {
        super(smi);
    }

    @Override
    public void send() {
        log.info("紧急信息");
    }
}
