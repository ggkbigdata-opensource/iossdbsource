/*
 * File Name：ScheduledTasks.java
 *
 * Copyrighe：copyright@2016 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2016年9月20日 下午9:42:10
 */
package com.ggkbigdata.ioss.dbsource.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * 定时触发获取itsm系统事件单数据请求
 * @author caiyu (caiy@ggkbigdata.com)
 * @version 1.0, 2016年9月20日 下午9:40:34
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledTasks{

    //每天凌晨四点五分执行一次
    @Scheduled(cron = "0 5 4 * * ?")
    public void reportCurrentByCron(){
        //TODO
        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + dateFormat ().format (new Date ()));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
    
}

