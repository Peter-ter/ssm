package com.web.handles;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.Question;
import com.web.services.QuestionService;

@Controller
@RequestMapping("/pxs")
public class UpdateQuestion {
	@Autowired
	private QuestionService qs;

	@RequestMapping("/updateQuestion.do")
	public String listQuestion(HttpServletRequest request) throws Exception {
		String title = request.getParameter("title");
		String optionA = request.getParameter("optionA");
		String optionB = request.getParameter("optionB");
		String optionC = request.getParameter("optionC");
		String optionD = request.getParameter("optionD");
		String answer = request.getParameter("answer");
		String id = request.getParameter("questionId");
		Question question = new Question(title, optionA, optionB, optionC, optionD, answer);
		question.setId(Integer.valueOf(id));
		this.qs.update(question);
		return "/pxs/listQuestion.do";
	}

}
