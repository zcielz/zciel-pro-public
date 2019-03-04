package cn.zciel.designPatterns.selfStudy.strategy.demo02;

/**
 * @author YINZHEN
 * @date 2019/2/28 14:17
 * @Description 微信标题
 */
public class WechatTitle implements ShareTitle {
    @Override
    public String showTitle() {

        return "shar,wechat,title";
    }
}
