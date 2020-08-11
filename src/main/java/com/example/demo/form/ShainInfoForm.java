package com.example.demo.form;

import javax.validation.constraints.NotEmpty;

public class ShainInfoForm {
	
	@NotEmpty(message = "IDを入力してください。")
	private String id;			//：ID
	
	private String name;		//：職員名
	
	private String sex;			//：性別
	
	private String position;	//：役職
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
