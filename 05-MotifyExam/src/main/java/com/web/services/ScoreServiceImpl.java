package com.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.bean.Score;
import com.web.daos.ScoreMapper;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
	

	@Autowired
	private ScoreMapper scoreDao;
	
	@Override
	public void insert(Score record) {
		this.scoreDao.insert(record);
	}
	@Override
	public List<Score> listScore(String userName, int startLine) {
		return this.scoreDao.listScore(userName,startLine);
	}
	
	@Override
	public int countRecord(String userName) {
		return this.scoreDao.countRecord(userName);
	}

}
