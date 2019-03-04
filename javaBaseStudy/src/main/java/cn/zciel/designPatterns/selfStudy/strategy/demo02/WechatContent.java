package cn.zciel.designPatterns.selfStudy.strategy.demo02;

/**
 * @author YINZHEN
 * @date 2019/2/28 14:18
 * @Description 微信分享内容
 */
public class WechatContent implements ShareContent {
    @Override
    public String showContent() {
        return "share,wechat,content";
    }
}
