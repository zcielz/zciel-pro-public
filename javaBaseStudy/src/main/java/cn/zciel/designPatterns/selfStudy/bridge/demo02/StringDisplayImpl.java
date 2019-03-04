package cn.zciel.designPatterns.selfStudy.bridge.demo02;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 14:32
 * @Description
 */
@Slf4j
public class StringDisplayImpl extends DisplayImpl {

    private String string;
    private int width;

    //构造方法，传入需要规范/美化的字符串
    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    /**
     * 实现父类的抽象方法
     */
    @Override
    public void rawOpen() {
        log.info("+");
        for (int i = 0; i < width; i++) {
            log.info("-");
        }
        log.info("+");
    }

    @Override
    public void rawPrint() {
        log.info("|" + string + "|");
    }

    @Override
    public void rawClose() {
        log.info("+");
        for (int i = 0; i < width; i++) {
            log.info("-");
        }
        log.info("+");
        log.info("*******************");
    }
}
