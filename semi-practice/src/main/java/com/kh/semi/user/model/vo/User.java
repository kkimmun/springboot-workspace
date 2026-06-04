package com.kh.semi.user.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

@Getter
@AllArgsConstructor
@Builder
@Value
@ToString
public class User {
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private String role;
	private String status;
}
