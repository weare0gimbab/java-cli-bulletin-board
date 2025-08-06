package com.ll;

import com.ll.domain.article.controller.ArticleController;
import com.ll.global.rq.Rq;

import java.util.Scanner;

public class App {
    public static Scanner scanner;

    App(Scanner scanner) {
        App.scanner = scanner;
    }
    public App() {
    }
    public static void run() {
        while (true) {
            System.out.print("명령어: ");
            String cmd = App.scanner.nextLine();
            Rq rq = new Rq(cmd);

            switch (rq.getActionName()) {
                case "exit" -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                case "write" -> {
                    ArticleController.writeArticle();
                }
                case "list" -> {
                    ArticleController.listArticle();
                }
                case "detail" -> {
                    ArticleController.showDetail(rq);
                }
                case "modify" -> {
                    ArticleController.updateArticle(rq);
                }
                case "delete" -> {
                    ArticleController.deleteArticle(rq);
                    break;
                }
                default -> System.out.println("알 수 없는 명령어입니다.");
            }
        }
    }


}
