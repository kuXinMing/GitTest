package cn.wh.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 登录Controller
 *
 * @author wanghao
 * @create 2018-08-06 上午8:02
 **/
public class LoginAction extends ActionSupport {

    public String login(){
        String username = getUsername();
        String password = getPassword();
        if("tom".equals(username) && "123".equals(password)){
            return "success";
        }
        return "failer";

    }
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
