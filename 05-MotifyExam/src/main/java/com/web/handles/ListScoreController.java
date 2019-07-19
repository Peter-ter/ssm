package com.web.handles;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.Score;
import com.web.bean.User;
import com.web.services.ScoreService;

@Controller
@RequestMapping("/pxs")
public class ListScoreController {

	@Autowired
	private ScoreService scoreService;

	@RequestMapping("/listScore.do")
	public String doListScore(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		String str_Page = request.getParameter("pageNo");
		int pageNo= str_Page!=null && !"".equals(str_Page)?Integer.valueOf(str_Page):1;
		User user = (User) session.getAttribute("userKey");
		int startLine = (pageNo - 1) * 3;
		//调用函数每次获取三个，通过startLine来控制每次调用的起点
		List<Score> list = scoreService.listScore(user.getUserName(),startLine);
		int totalPage = 0;
		int totalCount = scoreService.countRecord(user.getUserName());
		//通过返回的totalCount来确定页数
		totalPage = totalCount%3==0?totalCount/3:totalCount/3+1;
		//这里也可以通过request，但是在springMVC中，也可以使用model
		model.addAttribute("scoreList", list);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("totalPage", totalPage);
		
		return "/user/examsScore.jsp";

	}

}
