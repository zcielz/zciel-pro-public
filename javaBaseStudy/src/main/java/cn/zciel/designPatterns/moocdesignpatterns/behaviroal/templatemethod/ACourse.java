package cn.zciel.designPatterns.moocdesignpatterns.behaviroal.templatemethod;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:38
 * @Description
 */
public abstract class ACourse {

    protected final void makeCourse() {
        //this.makePPT();
        //this.makeVideo();
        if (needWriteAricle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("ppt");
    }

    final void makeVideo() {
        System.out.println("video");
    }

    final void writeArticle() {
        System.out.println("shouji");
    }

    //钩子方法
    protected boolean needWriteAricle() {
        return false;
    }

    abstract void packageCourse();

}
