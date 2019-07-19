package com.web.handles;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.services.QuestionService;

@Controller
@RequestMapping("/pxs")
public class DelectQuestion {
	@Autowired
	private QuestionService qs;

	@RequestMapping("/delectQuestion.do")
	public String listQuestion(HttpServletRequest request) {
		String questionId =request.getParameter("questionId");
		this.qs.delect(Integer.valueOf(questionId));
		return "/pxs/listQuestion.do";
	}
}
