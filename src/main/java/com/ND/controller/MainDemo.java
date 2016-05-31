package com.ND.controller;

import com.ND.bean.Product;
import com.ND.dao.ProductDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by quangdung on 31/05/2016.
 */
public class MainDemo {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
        ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");

        List<Product> products = productDAO.queryProduct();

        for (Product product : products) {
            System.out.println("Dept ID " + product.getId());
            System.out.println("Dept No " + product.getTitle());
            System.out.println("Dept Name " + product.getDescription());
        }
    }
}
