package com.ll.domain.article.controller;

import com.ll.App;
import com.ll.Article;
import com.ll.domain.article.service.ArticleService;
import com.ll.global.rq.Rq;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ArticleController {
    private static ArticleService articleService = new ArticleService();

    public static void writeArticle() {
        System.out.print("제목: ");
        String title = App.scanner.nextLine().trim();
        System.out.print("내용: ");
        String content = App.scanner.nextLine().trim();

        Article article=articleService.write(title, content, getCurrentDate());
        System.out.println(article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", article.getId());}

    public static void listArticle() {
        System.out.println("번호 |  제목  | 등록일");
        System.out.println("-----------------------------");
        for(Article article: articleService.findForList()) {
            System.out.printf("%d | %s | %s\n", article.getId(), article.getTitle(), article.getRegDate());
        }
    }

    public static void showDetail(Rq rq) {
        int id = rq.getParamsAsInt("id", -1);

        System.out.println("번호 : " + id);
        Article article = articleService.findById(id);
        System.out.printf("제목 : %s\n",article.getTitle());
        System.out.printf("내용 : %s\n", article.getContent());
        System.out.printf("등록일 : %s\n", article.getRegDate());
    }

    public static void deleteArticle(Rq rq) {
        int id = rq.getParamsAsInt("id", -1);
        articleService.delete(id);
        System.out.println("게시글이 삭제되었습니다.");
    }
    public static String getCurrentDate() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(formatter);
    }

    public static void updateArticle(Rq rq) {
        int id=rq.getParamsAsInt("id", -1);
        System.out.print("제목 (현재: " + articleService.findById(id).getTitle() + "): \n");
        String title = App.scanner.nextLine().trim();
        System.out.print("내용 (현재: " + articleService.findById(id).getContent() + "): \n");
        String content = App.scanner.nextLine().trim();
        Article aricle = articleService.findById(id);
        articleService.modify(aricle,id, title, content, getCurrentDate());
        System.out.println("게시글이 수정되었습니다.");
    }
}
