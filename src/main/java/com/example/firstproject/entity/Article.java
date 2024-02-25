package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity // DB가 해당 객체를 인식 가능!
@AllArgsConstructor // 생성자를 직접 작성하는 대신 lombok 을 사용해서 리팩토링
@ToString // toString()를 직접 작성하는 대신 lombok 을 사용해서 리팩토링
public class Article {

    // DB가 알 수 있는 규격화된 객체 생성
    @Id // 대푯값을 지정! like a 주민등록번호
    @GeneratedValue // 1, 2, 3, ... 자동 생성 어노테이션!
    private Long id;
    @Column // DB의 table 과 연결되도록
    private String titles;
    @Column
    private String content;

    public Article() {

    }
}
