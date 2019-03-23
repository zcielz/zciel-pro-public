package cn.zciel.learn.Jdbc_way;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class MyJob implements Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        log.info("MyJob is start...");

        log.info("Hello quzrtz " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        log.info("MyJob is end ...");
    }
}
