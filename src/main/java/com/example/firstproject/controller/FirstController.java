package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String nceToMeetYou(Model model) {
        model.addAttribute("username", "성진");
        return "greeting"; // templates/greeting.mustache 파일을 찾아서 브라우저로 전송 !!
    }

}
