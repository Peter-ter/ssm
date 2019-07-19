package com.web.handles;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.beans.User;
import com.web.services.UserServiceImpl;

@Controller
@RequestMapping(value = "/user")
public class MyController {
    
    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @RequestMapping(value = "/test.do")
    public String Index(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userServiceImpl.getUserById(userId);
        model.addAttribute("user",user);
         return "User";
    }
}