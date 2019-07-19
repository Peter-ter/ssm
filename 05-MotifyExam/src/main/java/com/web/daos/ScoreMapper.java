package com.web.daos;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.bean.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

	List<Score> listScore(@Param("userName") String userName,@Param("startLine") int startLine);

	int countRecord(@Param("userName") String userName);
}