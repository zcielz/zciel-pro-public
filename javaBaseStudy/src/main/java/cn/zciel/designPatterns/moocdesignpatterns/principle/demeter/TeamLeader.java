package cn.zciel.designPatterns.moocdesignpatterns.principle.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YINZHEN
 * @date 2019/3/5 8:27
 * @Description
 */
@Slf4j
public class TeamLeader {

    public void checkNumberOfCourse() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        log.info("在线课程的数量:{}" + courseList.size());
    }
}
