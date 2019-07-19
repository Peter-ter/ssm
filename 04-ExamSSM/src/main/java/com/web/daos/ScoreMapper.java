package com.web.daos;

import com.web.beans.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}