package cn.zciel.designPatterns.moocdesignpatterns.principle.demeter;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:22
 * @Description
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourse();
    }
}
