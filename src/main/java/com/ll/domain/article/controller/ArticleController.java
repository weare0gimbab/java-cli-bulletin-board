package com.ll.domain.article.controller;

import com.ll.App;
import com.ll.Article;
import com.ll.domain.article.service.ArticleService;

public class ArticleController {

    private static ArticleService articleService = new ArticleService();
    public static void writeArticle() {
        System.out.print("제목: ");
        String title = App.scanner.nextLine().trim();
        System.out.print("내용: ");
        String content = App.scanner.nextLine().trim();

        Article article=articleService.write(title, content, getCurrentDate());
        System.out.println(article);
        System.out.println("게시물이 등록되었습니다.");
    }

    public static void listArticle() {
        System.out.println("번호 | 제목       | 등록일");
        System.out.println("-----------------------------");
        for(Article article: articleService.findForList()) {
            System.out.printf("%d | %s | %s\n", article.getId(), article.getTitle(), article.getRegDate());
        }
    }

    public static void showDetail(int id) {
    }

    public static void deleteArticle(int id) {
        System.out.println("게시물이 삭제되었습니다.");
    }
    public static String getCurrentDate(){
        java.util.Date date = new java.util.Date();
        return String.format("%tF %<tT", date);
    }
}
