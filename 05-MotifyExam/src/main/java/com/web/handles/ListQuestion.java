package com.web.handles;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.Question;
import com.web.services.QuestionService;

@Controller
@RequestMapping("/pxs")
public class ListQuestion {
	
	@Autowired
	private QuestionService qs;
	
	@RequestMapping("/listQuestion.do")
	public String listQuestion(HttpServletRequest request) {
		String str_Page=request.getParameter("pageNo");
        int pageNo= str_Page!=null && !"".equals(str_Page)?Integer.valueOf(str_Page):1;
        int startLine = (pageNo-1) * 3;
        List<Question> list = qs.list(startLine);
        int totalCount = qs.countAll();
        int totalPage = totalCount%3==0?totalCount/3:totalCount/3+1;
		
        request.setAttribute("questionList", list);
        request.setAttribute("pageNo", pageNo);
        request.setAttribute("totalPage", totalPage);
		
		return "/exammanager/exams.jsp";
	}
}
