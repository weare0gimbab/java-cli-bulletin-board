package com.ll.domain.article.repository;

import com.ll.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArticleRepository {
private final List<Article> articlesList= new ArrayList<>();
int lastId = 0;

    public List<Article> findForList() {
        return articlesList
                .stream()
                .limit(5)
                .collect(Collectors.toList());
    }
    public int findIndexById(int id) {
        return IntStream
                .range(0, articlesList.size())
                .filter(i -> articlesList.get(i).getId() == id)
                .findFirst()
                .orElse(-1);
    }

    public Article findById(int id) {
        int index = findIndexById(id);

        if (index == -1) return null;

        return articlesList.get(index);
    }

    public Article save(Article article) {
        article.setId(++lastId);
        articlesList.add(article);
        return article;
    }

    public void delete(Article article) {
        int index = findIndexById(article.getId());

        if (index != -1) {
            articlesList.remove(index);
        }
    }
}
