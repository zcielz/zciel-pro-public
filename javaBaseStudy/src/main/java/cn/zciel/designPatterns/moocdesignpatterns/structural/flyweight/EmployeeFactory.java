package cn.zciel.designPatterns.moocdesignpatterns.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:16
 * @Description
 */
@Slf4j
public class EmployeeFactory {

    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if (manager == null) {
            manager = new Manager(department);
            log.info("创建部内经理:" + department);
            String reportContent = department + "部门汇报：此次汇报的主要内容是...";
            manager.setReportContent(reportContent);
            log.info("创建报告:" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }

}
