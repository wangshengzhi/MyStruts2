package com.wsz.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by wangshengzhi on 2016/7/15.
 */
public class DynamicMethodInvocationAction extends ActionSupport{
    public String save(){
        System.out.println("save...");
        return SUCCESS;
    }
    public String update(){
        System.out.println("succss");
        return SUCCESS;
    }
}
