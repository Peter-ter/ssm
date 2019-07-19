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
public class FindUser {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/findUser.do")
	public String Index(HttpServletRequest request, Model model) {
		String userId=request.getParameter("ck");
		User user = this.userService.find(Integer.valueOf(userId));
		request.setAttribute("userKey", user);
		return "/usermanager/userEdit.jsp";
	}
}
