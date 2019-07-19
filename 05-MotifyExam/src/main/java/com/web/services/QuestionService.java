package com.web.services;

import java.util.List;

import com.web.bean.Question;

public interface QuestionService {

	List<Question> test();

	int insert(Question question);

	List<Question> list(int startLine);

	int countAll();

	Question find(Integer valueOf);

	void delect(Integer valueOf);

	void update(Question question);



}
