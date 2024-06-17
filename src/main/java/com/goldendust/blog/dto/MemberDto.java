package com.goldendust.blog.dto;

public class MemberDto {
	private String memberID;
	private String memberPW;
	private String memberName;
	private int memberAge;
	private String memberEmail;
	
	protected MemberDto() {}
	
	public MemberDto(String id, String pw, String name, String age, String email) {
		this.memberID = id;
		this.memberPW = pw;
		this.memberName = name;
		this.memberAge = Integer.parseInt(age);
		this.memberEmail = email;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String id) {
		this.memberID = id;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String password) {
		this.memberPW = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String name) {
		this.memberName = name;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int age) {
		this.memberAge = age;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String email) {
		this.memberEmail = email;
	}
	
	
}
