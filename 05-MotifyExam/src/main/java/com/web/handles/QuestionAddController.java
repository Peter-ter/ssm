package com.web.handles;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.Question;
import com.web.services.QuestionService;

@Controller
@RequestMapping("/pxs")
public class QuestionAddController {
	
	@Autowired
	private QuestionService qs;
	
	@RequestMapping("/addQuestion.do")
	public String doAddQuestion(HttpServletRequest request) {
		String title, optionA, optionB, optionC, optionD, answer = null;
		title = request.getParameter("title");
		optionA = request.getParameter("optionA");
		optionB = request.getParameter("optionB");
		optionC = request.getParameter("optionC");
		optionD = request.getParameter("optionD");
		answer = request.getParameter("answer");
		Question question = new Question(title, optionA, optionB, optionC, optionD, answer);
		int num = qs.insert(question);
		return "/exammanager/examAdd.html";
	}
}
