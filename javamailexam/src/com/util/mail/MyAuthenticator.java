package com.util.mail;

import javax.mail.*;

/**
 * 身份认证
 * 及验证用户名密码
 */
public class MyAuthenticator extends Authenticator{
    String userName=null;
    String password=null;

    public MyAuthenticator(){
    }
    public MyAuthenticator(String username, String password) {
        this.userName = username;
        this.password = password;
    }

    /**
     * 验证用户名密码
     * @return
     */
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(userName, password);
    }
}
 
