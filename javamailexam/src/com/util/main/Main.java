package com.util.main;

import com.util.timer.SendMailTimer;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Description: 这是启动发送邮件事件的主类
 * User: NanChengRu
 * Date: 13-11-21
 * Time: 上午10:37
 * JDK: 1.6
 * version: 1.0
 */
public class Main {
    private static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args){
        //初始化log4j配置
        initLog4j();
        //启动邮件定时器
        SendMailTimer smt = new SendMailTimer();
        smt.startSendmainTimer();
    }

    /**
     * 配置log4j
     */
    private static void initLog4j(){
        String log4jPath = Main.class.getResource("/resource/log4j/log4j.properties").getPath();
        PropertyConfigurator.configure(log4jPath);
        log.info("log4j被初始化 配置文件路径：" + log4jPath);
    }

}
