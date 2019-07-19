package com.web.daos;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.bean.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);

	List<Question> test();

	List<Question> list(@Param("startLine") int startLine);

	int countAll();
}