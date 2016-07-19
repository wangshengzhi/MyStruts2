package com.wsz.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wsz.bean.Product;

/**
 * Created by wangshengzhi on 2016/7/15.
 */
public class ProductAction extends ActionSupport {

    private Product product;

    private static final long serialVersionUID = 6070936404572632453L;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String execute() throws Exception {
        product.setId(1);
        System.out.println(product);
        System.out.println("hello");
        return "details";
    }

    /**
     * 如果使用save方法则需要在struts.xml文件中配置action的method为需要使用的方法名
     * @return
     * @throws Exception
     */

    private String save() throws Exception{
        product.setId(1);
        System.out.println(product);
        return "details";
    }
}
