package logic;

import java.io.Serializable;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Subscriber implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Fname, LName, PhoneNum, Email, Visa, UserName, Password, Role;
	private int id, SubNum;
	private int Is_new_subscriber;
	
	public Subscriber() {
		
	}

	public Subscriber(String fname, String lName, int Id, String phoneNum, String email, String visa, int subNum,String username,String password, String role,int is_new_subscriber) {
		super();
		Fname = fname;
		LName = lName;
		id = Id;
		PhoneNum = phoneNum;
		Email = email;
		Visa = visa;
		SubNum = subNum;
		UserName = username;
		Password = password;
		Role = role;
		Is_new_subscriber = is_new_subscriber;
	
	}
	
	

	public int getIs_new_subscriber() {
		return Is_new_subscriber;
	}

	public void setIs_new_subscriber(int is_new_subscriber) {
		Is_new_subscriber = is_new_subscriber;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return Fname;
	}
	
	public void setFname(String fname) {
		Fname = fname;
	}
	
	public String getLName() {
		return LName;
	}
	
	public void setLName(String lName) {
		LName = lName;
	}
	
	public String getPhoneNum() {
		return PhoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getVisa() {
		return Visa;
	}
	
	public void setVisa(String visa) {
		Visa = visa;
	}
	
	public int getSubNum() {
		return SubNum;
	}
	
	public void setSubNum(int subNum) {
		SubNum = subNum;
	}
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
	
	@Override
	public String toString() {
		return this.Fname + " " + this.LName + " " + this.id + " " + this.Email + " " + this.PhoneNum + " " + this.Visa + " " + this.SubNum +" "+ this.UserName+" "+ this.Password;
	}
}
