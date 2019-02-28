package cn.zciel.selfStudy.strategy.demo02;

/**
 * @author YINZHEN
 * @date 2019/2/28 14:16
 * @Description 分享链接
 */
public interface ShareLink {
    String getShareLink(final String platform, final String userToken);
}
