package com.wsz.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.RequestMap;
import org.apache.struts2.dispatcher.SessionMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by wangshengzhi on 2016/7/17.
 */
public class ContextAction extends ActionSupport{

    private static final long serialVersionUID = 8981246377366860390L;

    @Override
    public String execute() throws Exception {
//      ActionContext存储了Action的所有信息
        ActionContext actionContext=ActionContext.getContext();
        Map<String,Object> applicationMap=actionContext.getApplication();
        applicationMap.put("applicationKey","applicationValue");
        Map<String,Object> sessionMap=actionContext.getSession();
        sessionMap.put("sessionKey","sessionValue");
//      获取的sessionMap实际上是SessionMap对象，其有invalidate方法使session失效
        if(sessionMap instanceof SessionMap){
            SessionMap<String ,Object> session =(SessionMap<String ,Object>)sessionMap;
            session.invalidate();
            System.out.println("session失效");
        }
        Map<String,Object> request=(Map<String,Object>)actionContext.get("request");
        request.put("requestKey","requestValue");
//      getParameters()返回map只读，可写如单不起作用（没必要写入数据）
        Map<String,Object> parameters=actionContext.getParameters();
        if (parameters.get("pname")!=null){
            System.out.println(((String[])parameters.get("pname"))[0]);
        }
        HttpServletRequest request1 = ServletActionContext.getRequest();
        HttpSession session =request1.getSession();
        HttpServletResponse response=ServletActionContext.getResponse();
        ServletContext servletContext=ServletActionContext.getServletContext();
        return SUCCESS;
    }
}
