package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("username","zhang");
        return "index";
    }

    @RequestMapping("list")
    public String list(Model model){
        List<String> list = Arrays.asList("zhangsan","lisi");
        model.addAttribute("usernames",list);
        return "list";
    }


}
