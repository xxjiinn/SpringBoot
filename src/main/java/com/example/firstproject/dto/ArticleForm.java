package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 생성자를 직접 작성하는 대신 lombok 을 사용해서 리팩토링
@ToString // toString()를 직접 작성하는 대신 lombok 을 사용해서 리팩토링
public class ArticleForm {

    private final String title;
    private final String content;


    public Article toEntity() {
        return new Article(null, title, content);
    }
}
