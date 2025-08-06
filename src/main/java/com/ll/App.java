package com.ll;

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
                    ArticleRepository.ActionWrite();
                    break;
                }
                case "list" -> {
                    ArticleRepository.ActionList();
                    break;
                }
                case "detail" -> {
                    ArticleRepository.ActionDetail();
                    break;
                }
                case "delete" -> {
                    ArticleRepository.ActionDelete();
                    break;
                }
                default -> System.out.println("알 수 없는 명령어입니다.");
            }
        }
    }


}
