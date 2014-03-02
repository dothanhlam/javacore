package org.catapult.web.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ChangePassword {

	@Size(min=2, max=30) 
	@NotNull
	
	private String oldPassword;
	@Size(min=2, max=30) 
	@NotNull
	private String newPassword;
	
	@Size(min=2, max=30) 
	@NotNull
	private String confirmedPassword;
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmedPassword() {
		return confirmedPassword;
	}
	public void setConfirmedPassword(String confirmedPassword) {
		this.confirmedPassword = confirmedPassword;
	}
	
}
