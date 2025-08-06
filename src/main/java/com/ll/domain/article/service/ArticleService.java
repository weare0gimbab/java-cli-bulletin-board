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

    public Article findById(int id) {
        return articleRepository.findById(id);
    }

    public void modify(Article article, String title, String content, String currentDate) {
        article.setTitle(title);
        article.setContent(content);
        article.setRegDate(currentDate);
        articleRepository.save(article);
    }

    public boolean delete(int id) {
       Article article =articleRepository.findById(id);

        if (article == null) return false;

        articleRepository.delete(article);

        return true;
    }
}
