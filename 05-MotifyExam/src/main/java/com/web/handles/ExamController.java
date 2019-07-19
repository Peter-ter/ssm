package com.web.handles;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.Question;
import com.web.services.QuestionServiceImpl;

@Controller
@RequestMapping("/pxs")
public class ExamController {
    
    @Autowired
    private QuestionServiceImpl questionServiceImpl;
    
    @RequestMapping(value = "/test.do")
    public String doSome(HttpServletRequest request){
    	HttpSession session=request.getSession();
    	List<Question> list = questionServiceImpl.test();
    	session.setAttribute("questionList", list);
    	return "/user/exam.jsp";
    }
}
