package com.lsk.entity;

public class Author {
	
	private String name;
	private String mail_Id;
	public Author(String name, String mail_Id) {
		super();
		this.name = name;
		this.mail_Id = mail_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail_Id() {
		return mail_Id;
	}
	public void setMail_Id(String mail_Id) {
		this.mail_Id = mail_Id;
	}
	
	

}
