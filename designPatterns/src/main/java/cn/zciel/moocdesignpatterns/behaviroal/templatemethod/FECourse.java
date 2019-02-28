package cn.zciel.moocdesignpatterns.behaviroal.templatemethod;

/**
 * @author YINZHEN
 * @date 2019/2/28 15:42
 * @Description
 */
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("fecourse");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteAricle() {
        return needWriteArticleFlag;
//        return super.needWriteAricle();
    }
}
