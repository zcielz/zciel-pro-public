package cn.zciel.designPatterns.moocdesignpatterns.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:14
 * @Description
 */
@Slf4j
public class Manager implements Employee {

    private String title = "部门经理";
    private String department;
    private String reportContent;

    @Override
    public void report() {
        log.info(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
