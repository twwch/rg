package com.chtw.controller;

import com.chtw.bean.User;
import com.chtw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author CHTW
 * @date 2019-11-19-19:32
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public String login(User user, String code, HttpSession session){
        //System.out.println("code="+code);
        //String code1 = (String)session.getAttribute("code");
        //System.out.println("code1="+code1);
        //System.out.println(user.toString());
        int a = userService.checkUser(user);
        int i = userService.login(user);
        if(code==""){
            return "600";
        } else{
            String code1 = (String)session.getAttribute("code");
            System.out.println("code="+code+"\tcode1="+code1);
            if(session.getAttribute("code").equals(code)){
                if(a>0&&i>0){
                    return "200";
                }else{
                    return "202";
                }
            }else{
                return "500";
            }
        }


        //return "redirect:/index.html";
    }

}
