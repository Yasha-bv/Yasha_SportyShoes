package com.yasha.sportyshoes.form;

import com.yasha.sportyshoes.model.CustomerInfo;
import com.yasha.sportyshoes.model.UserInfo;

public class UserForm {

	  private String name;
	  private String role;
	  
	  public UserForm() {

	    }

	    public UserForm(UserInfo userInfo) {
	        if (userInfo != null) {
	            this.name = userInfo.getName();
	            this.role = userInfo.getRole();
	        }
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
