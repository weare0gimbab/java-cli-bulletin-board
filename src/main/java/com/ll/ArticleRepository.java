package com.ll;

public class ArticleRepository {
    public static void ActionWrite() {
        System.out.print("제목: ");
        String title = App.scanner.nextLine().trim();
        System.out.print("내용: ");
        String content = App.scanner.nextLine().trim();
        System.out.println("게시물이 등록되었습니다.");
    }

    public static void ActionList() {
    }

    public static void ActionDetail() {
    }

    public static void ActionDelete() {
    }
}
