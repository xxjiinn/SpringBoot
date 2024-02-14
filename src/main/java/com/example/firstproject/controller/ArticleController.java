package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticle() {
        System.out.println("/articles/new 로 이동!");
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println("/articles/create 로 이동!");
        System.out.println(form.toString());


        // 1, DTO(form)를 Entity로 변환!
        Article article = form.toEntity();

        // 2. Repository에게 Entiry를 DB 안에 저장하게 함!


        return "";
    }
}
