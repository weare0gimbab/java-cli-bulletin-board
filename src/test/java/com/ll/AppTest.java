package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AppTest {

    @Test
    @DisplayName("등록")
    public void testWrite() {

        String input = AppTestRunner.run("""
                        write
                        자바 공부
                        자바 텍스트 게시판 만들기
                        """);

        assertThat(input)
                .contains("제목: ")
                .contains("내용: ")
                .contains("게시물이 등록되었습니다.");
    }
    @Test
    @DisplayName("목록")
    public void testList() {

        String input = AppTestRunner.run("""
                        write
                        자바 공부
                        자바 텍스트 게시판 만들기
                        list
                        """);

        assertThat(input)
                .contains("번호 | 제목       | 등록일")
                .contains("-----------------------------")
                .contains("1    | 자바 공부  | ");
    }
}