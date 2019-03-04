package cn.zciel.designPatterns.selfStudy.bridge.demo02;

/**
 * @author YINZHEN
 * @date 2019/3/4 14:30
 * @Description
 */
public abstract class DisplayImpl {

    //打开输出框
    public abstract void rawOpen();

    //在输出框里面打印字符串
    public abstract void rawPrint();

    //当打印字符串结束后，关闭输出框
    public abstract void rawClose();
}
