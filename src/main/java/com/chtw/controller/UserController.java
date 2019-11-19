package com.chtw.controller;

import com.chtw.bean.User;
import com.chtw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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


    @RequestMapping("/getInfo")
    @ResponseBody
    public Map<String,Integer> getInfo(){
        Map<String,Integer> map = userService.getNumberInfo();
        return map;
    }

    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        session.removeAttribute("code");
        return "redirect:/out";
    }

    @RequestMapping("/userlogin")
    @ResponseBody
    public String userlogin(User user){
        int a = userService.checkUser(user);
        int i = userService.login(user);
        if(a>0){
            if(i>0){
                return "200";
            }else{
                return "202";
            }
        } else {
            return "201";
        }
    }


    @RequestMapping("/userregister")
    @ResponseBody
    public String userregister(User user){
        int i = userService.register(user);
        return  null;
    }
}
