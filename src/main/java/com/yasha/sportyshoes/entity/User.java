package com.yasha.sportyshoes.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Accounts")
public class User implements Serializable {

	 private static final long serialVersionUID = -2054386655979281969L;

	    public static final String ROLE_MANAGER = "MANAGER";
	    public static final String ROLE_EMPLOYEE = "EMPLOYEE";

	    @Id
	    @Column(name = "User_Name", length = 20, nullable = false)
	    private String userName;

	  
	    public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getUserRole() {
			return userRole;
		}


		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}


		@Column(name = "User_Role", length = 20, nullable = false)
	    private String userRole;

	    
}
