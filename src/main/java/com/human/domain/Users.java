package com.human.domain;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 회원 
 * @author h
 *
 */
@Data
public class Users {
	
	private int userNo;					// 회원번호
	private String userId;				// 아이디
	private String userPw;				// 패스워드
	private String userPwChk;			// 패스워드 확인
	private String name;				// 이름
	private String birthday;
	private String email;				// 이메일
	private String gender;				// 성별(23/3/14 추가 完)
	private String address;				// 성별(23/3/14 추가 完)
	private String address_detail;				// 성별(23/3/14 추가 完)
	private int enabled;				// 휴면여부
	private LocalDateTime regDate;		// 등록일자
	private LocalDateTime updDate;		// 수정일자
	

}








