package com.learn.springcoreone.list;

import java.util.List;

public class Hospital {
	private String name;
	private List<String> depts;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepts() {
		return depts;
	}
	public void setDepts(List<String> depts) {
		this.depts = depts;
	}
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", depts=" + depts + "]";
	}
	

}
