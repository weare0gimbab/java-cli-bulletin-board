package com.ll;

import com.ll.domain.article.controller.ArticleController;

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
            String cmd = App.scanner.nextLine().trim();
            switch (cmd) {
                case "exit" -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                case "write" -> {
                    ArticleController.writeArticle();
                    break;
                }
                case "list" -> {
                    ArticleController.listArticle();
                    break;
                }
                case "detail" -> {
                    ArticleController.showDetail(1);
                    break;
                }
                case "delete" -> {
                    ArticleController.deleteArticle(1);
                    break;
                }
                default -> System.out.println("알 수 없는 명령어입니다.");
            }
        }
    }


}
