package com.ND.daoimpl;

import com.ND.bean.Product;
import com.ND.dao.ProductDAO;
import com.mysql.jdbc.exceptions.MySQLDataException;

import javax.activation.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by quangdung on 30/05/2016.
 */
public class ProductImplDAO implements ProductDAO{

    DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Product> queryProduct() throws SQLException {
        return null;
    }
}
