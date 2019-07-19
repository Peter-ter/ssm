package com.web.handles;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.beans.User;
import com.web.services.UserServiceImpl;

@Controller
@RequestMapping(value = "/Exam")
public class LoginController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/LoginServlet")
	public String Index(HttpServletRequest request, Model model) {
		String userName, password = null;
		userName = request.getParameter("userName");
		password = request.getParameter("password");
		User user = userServiceImpl.getByUserNameAndPassword(userName, password);
		if(user==null){
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
	    	   
	    	   return "/index.jsp";
	       }
	}
}
