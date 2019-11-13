package com.chtw.controller;

import com.chtw.bean.User;
import com.chtw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author CHTW
 * @date 2019-11-09-19:48
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAll();
    }

    @RequestMapping("/login")
    public String login(){
        return "redirect:/index.html";
    }

    @RequestMapping("/getInfo")
    @ResponseBody
    public Map<String,Integer> getInfo(){
        Map<String,Integer> map = userService.getNumberInfo();
        return map;
    }
}
