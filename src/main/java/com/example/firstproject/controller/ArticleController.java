package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅 기능을 위한 어노테이션
public class ArticleController {

    @Autowired // 스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticle() {
//        System.out.println("/articles/new 로 이동!"); -> 로깅 기능으로 대체!
        log.info("/articles/new 로 이동!");
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
//        System.out.println("/articles/create 로 이동!");
//        System.out.println(form.toString());
        log.info("/articles/create 로 이동!");
        log.info(form.toString());

        // 1, DTO(form)를 Entity로 변환!
        Article article = form.toEntity(); // Article: Entity class, toEntity(): 메서드
//        System.out.println(article.toString());
        log.info(article.toString());

        // 2. Repository에게 Entiry를 DB 안에 저장하게 함!
        Article saved = articleRepository.save(article);
//        System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
