package cn.zciel.learn.ram_way;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * 要测试RAMdemo的代码，请先删除demo中这个quartz.properties文件，或者重命名！否则会测试不成功！
 */
@Slf4j
public class RAMJob implements Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        log.info("Say Hello to Quartz" + new Date());
    }
}
