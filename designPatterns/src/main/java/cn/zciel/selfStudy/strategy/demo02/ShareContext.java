package cn.zciel.selfStudy.strategy.demo02;

import lombok.Data;

/**
 * @author YINZHEN
 * @date 2019/2/28 14:22
 * @Description 策略上下文
 */
public class ShareContext {

    protected ShareTitle shareTitle;

    protected ShareContent shareContent;

    protected ShareImageUrl shareImageUrl;

    protected ShareLink shareLink;

    public static ShareContext getShareTarget(Integer type) {
        String className = type.toString();
        Class cls = null;

        try {
            cls.forName(className);
            return (ShareContext) cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public final String showTitle() {
        return shareTitle.showTitle();
    }

    public final String showContent() {
        return shareContent.showContent();
    }

    public final String displayImageUrl(final String platform, final String userToken) {
        return shareLink.getShareLink(platform, userToken);
    }

    public static ShareInfo getShareInfo(ShareContent content, String platform,
                                         String userToken) {
        ShareInfo info = new ShareInfo();
        info.setContent(content.showContent());
       /* info.setImageUrl(context.displayImageUrl(platform));
        info.setTitle(context.showTitle());
        info.setShareLink(context.displayShareLinkUrl(platform, userToken));*/
        return info;
    }

    @Data
    private static class ShareInfo {

        private String content;
        private String imageUrl;
        private String title;
        private String shareLink;

    }
}
