package com.nzp.controller;

import com.nzp.bean.User;
import com.nzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model){

        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        model.addAttribute("users",users);
        return "result";
    }
    @RequestMapping("/login")
    public String login(Model model,User user){

        boolean login = userService.login(user.getUsername(), user.getPassword());

        if (login){
           model.addAttribute("msg", "登录完成");
            return "success";
       }else {
           model.addAttribute("msg","登录失败");
       }


        return "error";
    }


}
