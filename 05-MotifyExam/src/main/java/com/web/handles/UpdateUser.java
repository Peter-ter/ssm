package com.web.handles;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.User;
import com.web.services.UserService;

@Controller
@RequestMapping("/pxs")
public class UpdateUser {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/updateUser.do")
	public String Index(HttpServletRequest request, Model model) {
		String userCode = request.getParameter("userCode");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String userId= request.getParameter("userId");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        User user = new User(Integer.valueOf(userId), userCode, userName, password, email, tel);
        this.userService.update(user);
        
		return "/pxs/listUsers.do";
	}
}
