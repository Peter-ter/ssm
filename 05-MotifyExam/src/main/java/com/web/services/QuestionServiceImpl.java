package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.bean.Question;
import com.web.daos.QuestionMapper;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionMapper questionDao;
	
	@Override
	public List<Question> test() {
		return this.questionDao.test();
	}

	@Override
	public int insert(Question question) {
		return this.questionDao.insertSelective(question);
	}

	

	@Override
	public int countAll() {
		return this.questionDao.countAll();
	}

	@Override
	public List<Question> list(int startLine) {
		return this.questionDao.list(startLine);
	}

	@Override
	public Question find(Integer valueOf) {
		return this.questionDao.selectByPrimaryKey(valueOf);
	}

	@Override
	public void delect(Integer valueOf) {
		this.questionDao.deleteByPrimaryKey(valueOf);
		
	}

	@Override
	public void update(Question question) {
		this.questionDao.updateByPrimaryKeySelective(question);
	}

	
	
}
