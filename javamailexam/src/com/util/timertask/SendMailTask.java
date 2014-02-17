package com.util.timertask;

import com.util.mail.MailSenderInfo;
import com.util.mail.SimpleMailSender;

import java.util.TimerTask;

/**
 * Description:
 * User: NanChengRu
 * Date: 13-11-20
 * Time: 下午9:23
 * JDK: 1.6
 * version: 1.0
 */
public class SendMailTask extends TimerTask{
    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        //这个类主要是设置邮件
        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.163.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("ru2013_1@163.com");
        mailInfo.setPassword("195589");//您的邮箱密码
        mailInfo.setFromAddress("ru2013_1@163.com");
        mailInfo.setToAddress("1042391443@qq.com");
        mailInfo.setSubject("设置邮箱标题");
        mailInfo.setContent("javamail  邮件测试!!!!!!!!!");
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
        //sms.sendTextMail(mailInfo);//发送文体格式
        boolean isSend = sms.sendHtmlMail(mailInfo);//发送html格式
    }

}
