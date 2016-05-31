package com.ND.daoimpl;

import com.ND.bean.Product;
import com.ND.dao.ProductDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import javax.xml.soap.Text;

/**
 * Created by quangdung on 30/05/2016.
 */
public class ProductImplDAO implements ProductDAO{

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Product> queryProduct() throws SQLException {
        Connection conn = dataSource.getConnection();
        String sql = "Select * from products";
        Statement stm = conn.createStatement();

        ResultSet resultSet = stm.executeQuery(sql);
        List<Product> list = new ArrayList<Product>();
        while (resultSet.next()) {
            Integer productId = resultSet.getInt("id");
            String productTitle = resultSet.getString("title");
            String productDescription = resultSet.getString("description");
            Product product = new Product(productId, productTitle,productDescription);
            list.add(product);
        }
        return list;
    }
}
