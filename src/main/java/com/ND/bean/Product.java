package com.ND.bean;

import javax.xml.soap.Text;

/**
 * Created by quangdung on 30/05/2016.
 */
public class Product {
    public Product(Integer id, String title, String description, Text content) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
    }

    private Integer id;
    private String title;
    private String description;
    private Text content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Text getContent() {
        return content;
    }

    public void setContent(Text content) {
        this.content = content;
    }
}
