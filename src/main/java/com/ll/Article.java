package com.ll;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Article {
    int id;
    String title;
    String content;
    String regDate;


    public Article(String title, String content, String currentDate) {
        this.id = 1;
        this.title = title;
        this.content = content;
        this.regDate = currentDate;
    }

    public boolean isNew() {
        return id == 0;
    }
}
