package com.web.services;

import java.util.List;

import com.web.bean.Score;

public interface ScoreService {

	void insert(Score userScore);

	List<Score> listScore(String userName, int startLine);

	int countRecord(String userName);

}
