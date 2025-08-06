package com.ll.domain.article.service;

import com.ll.Article;
import com.ll.domain.article.repository.ArticleRepository;

import java.util.List;

public class ArticleService {
    private final ArticleRepository articleRepository;
    public ArticleService() {
        articleRepository = new ArticleRepository();
    }

    public List<Article> findForList() {
        return articleRepository.findForList();
    }

    public Article write(String title, String content, String currentDate) {
        Article article=new Article(title, content, currentDate);
        articleRepository.save(article);
        return article;
    }
}
