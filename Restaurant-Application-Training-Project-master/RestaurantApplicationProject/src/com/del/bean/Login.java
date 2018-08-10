package com.del.bean;


import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userlogin")
public class Login {
	@Id
	// @Column(name = "username")
	private String username;
	private String password;
	public Login() {

	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//	public String getLogin() {
//		return username;
//	}
//	public void setLogin(String username) {
//		this.username = username;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [login=" + username + ", password=" + password + "]";
	}
	
	
}
