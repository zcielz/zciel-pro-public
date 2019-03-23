package cn.zciel.learn.Jdbc_way;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.List;

@Slf4j
public class QuartzJdbcTest {

    public static void main(String[] args) throws SchedulerException {
//        startSchedule();
        resumeJob();

    }

    //开始一个SimpleSchedule()调度
    public static void startSchedule() throws SchedulerException {

        //1.创建一个JobDetail实例，指定Quartz
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class)
                .withIdentity("job1_1", "jGroup1") //启动任务类
                .build(); //人物名，任务组

        //触发器类型
        SimpleScheduleBuilder builder = SimpleScheduleBuilder
                .repeatSecondlyForTotalCount(5); //设置执行次数

        //CronScheduleBuilder builder = CronScheduleBuilder.cronSchedule("0/2 * * * * ?");
        //2.创建Trigger
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1_1", "tGroup1").startNow()
                .withSchedule(builder)
                .build();

        //3.创建Scheduler
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();

        //4.调度指向
        scheduler.scheduleJob(jobDetail, trigger);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.info(e.getMessage(), e);
        }

        //关闭调度器
        scheduler.shutdown();

    }

    //从数据库中找到已经存在的job,并重新开户调度
    public static void resumeJob() {
        try {
            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();
            JobKey jobKey = new JobKey("job1_1", "jGroup1");
            List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobKey);
            //SELECT TRIGGER_NAME, TRIGGER_GROUP FROM {0}TRIGGERS WHERE SCHED_NAME = {1} AND JOB_NAME = ? AND JOB_GROUP = ?
            // 重新恢复在jGroup1组中，名为job1_1的 job的触发器运行
            if (triggers.size() > 0) {
                for (Trigger tg : triggers) {
                    //根据类型判断
                    if ((tg instanceof CronTrigger) || (tg instanceof SimpleTrigger)) {
                        //恢复job运行
                        scheduler.resumeJob(jobKey);
                    }
                }
                scheduler.start();
            }
        } catch (Exception e) {
            log.info(e.getMessage(), e);
        }
    }
}
