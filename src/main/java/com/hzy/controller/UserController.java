package com.hzy.controller;
import com.hzy.pojo.User;
import com.hzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    // controller掉用service
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String queryUserByName(String username, String password, Model model, HttpSession session) {
        User user =  userService.queryUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("msg","登录成功");
            // 重定向
            return "redirect:/home";
        }else {
            model.addAttribute("loginMsg","用户名或密码错误");
            return "index";
        }
    }
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/register")
    public String register(User user,Model model) {
        List<User> list = userService.queryAllUser();
        for (User user1 : list) {
            if (user1.getUsername().equals(user.getUsername())) {
                model.addAttribute("registerMsg","账号已存在");
                return "register";
            }
        }
        userService.addUser(user);
        // 重定向
        return "index";
    }

}
