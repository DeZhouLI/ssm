package com.lidezhou.service;

import org.springframework.stereotype.Service;

import com.lidezhou.pojo.User;

@Service
public interface UserService {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
