package com.example.news.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity extends  BaseEntity {

    @Column(name = "code")
    public String code;

    @Column(name = "name")
    public String name;

    @OneToMany(mappedBy = "category")
    private List<NewsEntity> news = new ArrayList<>();

    public List<NewsEntity> getNews() {
        return news;
    }

    public void setNews(List<NewsEntity> news) {
        this.news = news;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
