package com.soft.lion.controller;

import com.soft.lion.model.User;
import com.soft.lion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public String getAll(Model model) throws Exception {
//        List<User> userList = userService.getAll();
//        model.addAttribute("userList", userList);
        return "userList";
    }
}
