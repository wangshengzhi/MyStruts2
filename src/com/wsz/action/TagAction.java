package com.wsz.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wsz.bean.Product;

import java.util.*;

/**
 * Created by wangshengzhi on 2016/7/19.
 */

public class TagAction extends ActionSupport{
    private int price;
    private Date date;
    private List<Product> products;
    private ProductComparator productComparator;

    private static final long serialVersionUID = 2924893468549086559L;

    @Override
    public String execute() throws Exception {
        price=1000;
        products = new ArrayList<Product>();
        products.add(new Product(1001,"b name 1"));
        products.add(new Product(1002,"a name 2"));
        productComparator =new ProductComparator();
        date = Calendar.getInstance().getTime();
        return SUCCESS;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductComparator getProductComparator() {
        return productComparator;
    }

    public void setProductComparator(ProductComparator productComparator) {
        this.productComparator = productComparator;
    }

    class ProductComparator implements Comparator<Product>{
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
