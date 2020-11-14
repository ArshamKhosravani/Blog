package com.bahar.controller;

import com.bahar.model.User;
import com.bahar.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    IndexService indexService = new IndexService();
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/Users")
    public String getUsers(Model model){
     List<User> users= indexService.getUsers();
     model.addAttribute("users",users);
     return "users";
    }

}
