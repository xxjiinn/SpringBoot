package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 해당 파일이 Controller라는 어노테이션
public class FirstController {

    @GetMapping("/hi") // 주소창에 "/hi" 라는 주소를 입력하면 @GetMapping를 통해 여기로 찾아와서 해당 메서드 (niceToMeetYou())를 호출한다.
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "주인장"); // username이라는 변수의 값은 "주인장"
        return "greeting"; // templates/greeting.mustache 파일을 찾아서 브라우저로 전송 !!
    }

    @GetMapping("/byeee") // 주소창에 "/byeee" 라는 주소를 입력하면 @GetMapping를 통해 여기로 찾아와서 해당 메서드 (seeyouNext())를 호출한다.

    public String seeyouNext(Model model) {
        model.addAttribute("nickname", "개발자"); // nickname 변수의 값은 "개발자"
        return "goodbye"; // templates/goodbye.mustache 파일을 찾아서 브라우저로 전송 !!
    }

}