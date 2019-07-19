package com.web.handles;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.User;
import com.web.services.UserServiceImpl;

@Controller
@RequestMapping("pxs")
public class UserController {
    
    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @RequestMapping(value = "/login.do")
    public String Index(HttpServletRequest request, Model model){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        User user = userServiceImpl.login(userName, password);
        if(user==null){
        	//如果失败则返回到登录界面
	    	   return "/login.html";
	       }else{
	    	   HttpSession session = request.getSession();
	    	   session.setAttribute("userKey", user);
	    	   int flag = user.getFlag();
	    	   if(flag==1){
	    		   request.setAttribute("menuKey","menu_student.jsp" );
	    	   }else{
	    		   request.setAttribute("menuKey","menu_teacher.jsp" );
	    	   }
	    	   //如果成功则跳转到主界面
	    	   return "/index.jsp";
	       }
         
    }
}