package org.starrier.dreamwar.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;

import java.util.Map;

/**
 * Created by Starrier on 2018/1/16.
 */
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        /* 获取 JobDetail 关联的JobDataMap  */
        Map dataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        String size = (String) dataMap.get("size");

        ApplicationContext ctx = (ApplicationContext) dataMap.get("applocatonContext");
        System.out.println("size" + size);
        /* 对JobDataMap 所做的更改是否会被持久化取决于 任务的类型  */
        dataMap.put("size", size + "0");
    }
}
