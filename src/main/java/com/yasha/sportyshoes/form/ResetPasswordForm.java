package com.yasha.sportyshoes.form;

public class ResetPasswordForm {
	public String oldPass;
	public String newPass;
	public String confirmPass;
	
	public ResetPasswordForm(String oldPass,String newPass,String confirmPass) {
		this.oldPass = oldPass;
		this.newPass = newPass;
		this.confirmPass = confirmPass;	
	}

	public String getOldPass() {
		return oldPass;
	}

	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getConfirmPass() {
		return confirmPass;
	}

	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	
	
}
