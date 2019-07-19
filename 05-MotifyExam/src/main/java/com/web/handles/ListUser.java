package com.web.handles;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.User;
import com.web.services.UserService;


@Controller
@RequestMapping("/pxs")
public class ListUser {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/listUsers.do")
	public String Index(HttpServletRequest request, Model model) {
		String str_Page=request.getParameter("pageNo");
        int pageNo= str_Page!=null && !"".equals(str_Page)?Integer.valueOf(str_Page):1;
        int startLine = (pageNo-1) * 3;
        List<User> list = this.userService.listUser(startLine);
        int totalCount=this.userService.countAll();
        int totalPage =totalCount%3==0?totalCount/3:totalCount/3+1;
        
        request.setAttribute("userList", list);
        request.setAttribute("pageNo", pageNo);
        request.setAttribute("totalPage", totalPage);
		return "/usermanager/users.jsp";
	}
}
