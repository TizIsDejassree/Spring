package com.example.dayone;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Third {
	private int pid;
	@JsonIgnore
	private String pname;
	
	private String age;
	public Third(int pid, String pname, String age) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Third [pid=" + pid + ", pname=" + pname + ", age=" + age + "]";
	}
	

}
