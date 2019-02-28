package cn.zciel.selfStudy.strategy.demo02;

/**
 * @author YINZHEN
 * @date 2019/2/28 14:20
 * @Description 微信缩略图
 */
public class WechatImageUrl implements ShareImageUrl {
    @Override
    public String showImageUrl(String platform) {
        return "share,wecha,image" + platform;
    }
}
