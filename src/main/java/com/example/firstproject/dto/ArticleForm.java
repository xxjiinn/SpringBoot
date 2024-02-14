package com.example.firstproject.dto;

public class ArticleForm {

    private final String title;
    private final String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForms{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}
