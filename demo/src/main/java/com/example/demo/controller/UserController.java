package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    static final Logger log =
            LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String moveMain() {
        log.info("moveMain");

        return "Login";
    }
    @GetMapping("/getsignup")
    public String getSignUp(User signup, Model model) {
        log.info("getSignUp()");
        //model이 db랑 왔다갔다 하고 repo로 연결,
        // User를 user에 넣는다
        model.addAttribute("user", new User());
        return "SignUp";
    }

    @PostMapping("/postsignup")
    public String postSignUp (User signup, Model model)
            throws Exception {
        log.info("postSignUp()");
        model.addAttribute("msg", "SignUp Success!");
        return "SignUpSuccess";
    }
}
