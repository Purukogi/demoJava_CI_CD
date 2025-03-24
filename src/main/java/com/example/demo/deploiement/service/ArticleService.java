package com.example.demo.deploiement.service;

import com.example.demo.deploiement.bo.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    public List<Article> getAll(){

        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1L, "Chocolatine"));
        articles.add(new Article(2L, "Beurre Doux"));
        articles.add(new Article(3L, "Beurre Salé"));
        articles.add(new Article(4L, "Pain au Chocolat"));

        return articles;

    }
}
