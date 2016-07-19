package com.wsz.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wsz.bean.User;

/**
 * Created by wangshengzhi on 2016/7/15.
 */
public class UserAction extends ActionSupport{

    private static final long serialVersionUID = -2529010593784108449L;

    private User user;
    private String result;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String login(){
        return "info";
    }

    public  String save(){
        result="save success";
        return "success";
    }

    public String update(){
        result="update success";
        return "success";
    }

    public String delete(){
        System.out.println("delete");
        result="delete success";
        return SUCCESS;
    }

    public String query(){
        result="query success";
        return SUCCESS;
    }
}
