package com.wsz.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by wangshengzhi on 2016/7/17.
 */
public class AwareAction extends ActionSupport implements ApplicationAware ,SessionAware,RequestAware,ParameterAware,ServletContextAware,ServletRequestAware,ServletResponseAware{

    private static final long serialVersionUID = -964495464579044517L;

    private Map<String, Object> application;
    private Map<String, Object> session;
    private Map<String,Object> request;
    private Map<String, String[]> parameters;
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ServletContext servletContext;

    @Override
    public String execute() throws Exception {
        application.put("applicationKey","applicationValue");
        session.put("sessionKey","sessionValue");
        request.put("requestKey","requestValue");
        System.out.println(parameters.get("pname")[0]);
        servletRequest.setAttribute("requestKey","requestValue1");
        servletContext.setAttribute("applicationKey","applicationValue1");
        return SUCCESS;
    }
    public static String test(String param) {
        return "static method: " + param;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session=map;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.application=map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        this.request=map;
    }

    @Override
    public void setParameters(Map<String, String[]> map) {
        this.parameters=map;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.servletRequest=httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        this.servletResponse=httpServletResponse;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext=servletContext;
    }

}
