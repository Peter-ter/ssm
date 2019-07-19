package com.web.handles;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.bean.Question;
import com.web.bean.Score;
import com.web.bean.User;
import com.web.services.ScoreService;

@Controller
@RequestMapping("/pxs")
public class GradeController {
	
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping("/grade.do")
	public String doGrade(HttpServletRequest request) {
		int socre=0;
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userKey");
		List<Question> questionList = (List<Question>) session.getAttribute("questionList");
	    for(Question q:questionList){
	    	  String userAnswer=   request.getParameter("question"+q.getId());
	    	  if(q.getAnswer().equalsIgnoreCase(userAnswer)){
	    		  socre+=50;
	    	  }
	    }
	    Score userScore = new Score();
	    userScore.setUserId(user.getUserId());
	    userScore.setUserName(user.getUserName());
	    userScore.setUserScore(socre);
	    scoreService.insert(userScore);
	    return "listScore.do";
	}
}
