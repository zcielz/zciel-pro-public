package cn.zciel.designPatterns.moocdesignpatterns.creational.simplefactory;

/**
 * @author YINZHEN
 * @date 2019/3/1 11:26
 * @Description
 */
public class VideoFactory {
    public Video getVideo(Class c) {
        Video video = null;

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}