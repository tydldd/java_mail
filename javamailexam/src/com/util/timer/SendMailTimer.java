package com.util.timer;

import com.util.timertask.SendMailTask;
import org.apache.log4j.Logger;

import java.util.Timer;

/**
 * Description: 发送邮件的定时器
 * User: NanChengRu
 * Date: 13-11-20
 * Time: 下午9:23
 * JDK: 1.6
 * version: 1.0
 */
public class SendMailTimer {
    Logger log = Logger.getLogger(SendMailTimer.class);
    /**
     * 启动定时器
     */
    public void startSendmainTimer(){
        Timer timer = new Timer();
        timer.schedule(new SendMailTask(),1000,5000);
        log.debug("启动定时器发送邮件-每5秒发送一封邮件");
    }

}
