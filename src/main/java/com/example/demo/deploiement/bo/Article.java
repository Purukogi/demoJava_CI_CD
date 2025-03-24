package com.example.demo.deploiement.bo;

public class Article {

    private Long id;
    private String title;

    public Article() {
    }

    public Article(String title) {
        this.title = title;
    }

    public Article(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
