package com.ND.dao;

import com.ND.bean.Product;

import java.util.List;

/**
 * Created by quangdung on 30/05/2016.
 */
public interface ProductDAO {
    public List<Product> queryProduct() throws Exception ;
}
