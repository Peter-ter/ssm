package com.web.handles;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.Question;
import com.web.services.QuestionService;

@Controller
@RequestMapping("/pxs")
public class FindQuestion {

	@Autowired
	private QuestionService qs;

	@RequestMapping(value = "/findQuestion.do")
	public String dofind(HttpServletRequest request) {
		String questionId=request.getParameter("questionId");
		Question question = qs.find(Integer.valueOf(questionId));
		request.setAttribute("questionKey", question);
		return "/exammanager/examEdit.jsp";
	}

}
