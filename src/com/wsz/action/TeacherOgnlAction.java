package com.wsz.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.wsz.bean.Product;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.Struct;
import java.util.Map;

/**
 * Created by wangshengzhi on 2016/7/18.
 */
public class TeacherOgnlAction extends ActionSupport implements SessionAware,ApplicationAware,RequestAware{

    private static final long serialVersionUID = 403810920578686490L;
    private Map<String, Object> application;
    private Map<String, Object> request;
    private Map<String, Object> session;
    private String result;
    private Product product;
    @Override
    public String execute() throws Exception {
        product=new Product();
        product.setName("product1");
        product.setId(1);
        result="result";
        ValueStack valueStack= ActionContext.getContext().getValueStack();
        Product newProduct=new Product();
        newProduct.setId(2);
        newProduct.setName("product2");
        valueStack.push(newProduct);
        application.put("applicationKey","applicationValue");
        session.put("sessionKey","sessionValue");
        request.put("requestKey","requestValue");
        return SUCCESS;
    }
    public static String test(String param){
        return "static method"+param;
    }

    public Map<String, Object> getRequest() {
        return request;
    }

    public Map<String, Object> getApplication() {
        return application;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
    public void setSession(Map<String, Object> map) {
        this.session=map;
    }
}
