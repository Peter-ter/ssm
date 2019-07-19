package com.web.handles;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.services.UserService;

@Controller
@RequestMapping("/pxs")
public class DelectUser {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/delectUser.do")
	public String Index(HttpServletRequest request, Model model) {
		String userIdArray[] = request.getParameterValues("ck");
		 for(int i=0;i<userIdArray.length;i++){
         	String userId = userIdArray[i];
         	this.userService.delect(Integer.valueOf(userId));
         }
		return "/pxs/listUsers.do";
	}
}
