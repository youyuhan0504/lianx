package com.entity;

import java.util.Date;

public class Propety {
	private String name;
	private int age;
	private String sex;
	private Date sdate;
	
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Propety [name=" + name + ", age=" + age + ", sex=" + sex + ", sdate=" + sdate + "]";
	}
	public Propety(String name, int age, String sex, Date sdate) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.sdate = sdate;
	}
	public Propety() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
