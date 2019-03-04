package cn.zciel.designPatterns.moocdesignpatterns.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * @author YINZHEN
 * @date 2019/3/4 19:19
 * @Description
 */
@Slf4j
public class Test {

    private static final String departments[] = {"DR", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }

        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(100);
        Integer d = 1000;

        log.info("a=b?:{}", (a == b));
        log.info("c=d?:{}", (c == d));
    }

}
