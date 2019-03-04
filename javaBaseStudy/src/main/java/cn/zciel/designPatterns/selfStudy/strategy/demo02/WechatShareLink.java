package cn.zciel.designPatterns.selfStudy.strategy.demo02;

/**
 * @author YINZHEN
 * @date 2019/2/28 14:21
 * @Description 微信分享链接
 */
public class WechatShareLink implements ShareLink {
    @Override
    public String getShareLink(String platform, String userToken) {
        return "shar,wechar,link" + platform + userToken;
    }
}
