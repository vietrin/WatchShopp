package com.watchshop.model;

public class Admin {
	private String usersname;
	private String password;
	public String getUsersname() {
		return usersname;
	}
	public void setUsersname(String usersname) {
		this.usersname = usersname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(String usersname, String password) {
		super();
		this.usersname = usersname;
		this.password = password;
	}
	 
}
