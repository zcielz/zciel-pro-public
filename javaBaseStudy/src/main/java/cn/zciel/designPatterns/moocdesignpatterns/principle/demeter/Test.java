package cn.zciel.designPatterns.moocdesignpatterns.principle.demeter;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:31
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
