package com.kh.semi.user.model.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.kh.semi.user.model.vo.User;

@Mapper
public interface UserMapper {
	@Insert("INSERT INTO SEMI_PRACTICE_USER(USER_ID, USER_PWD, USER_NAME, EMAIL, ROLE) "
			+ "VALUES(#{userId}, #{userPwd}, #{userName}, #{email}, #{role}, 'Y')")
	public int signUp(User user);
}
