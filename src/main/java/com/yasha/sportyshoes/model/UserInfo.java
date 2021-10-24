package com.yasha.sportyshoes.model;

import java.util.List;

import com.yasha.sportyshoes.form.UserForm;

public class UserInfo {

	private String name;
	private String role;

   
	public UserInfo() {

	}

	public UserInfo(UserForm userForm) {
		this.name = userForm.getName();
		this.role = userForm.getRole();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
