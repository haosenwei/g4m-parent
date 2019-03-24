package com.go4mi.tool.tpl.bean;

import java.util.ArrayList;
import java.util.List;

public class Params {

	private List<Param> list = new ArrayList<Param>();

	public List<Param> getList() {
		return list;
	}

	public void setList(List<Param> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Params [list=" + list + "]";
	}
	
	
	
}
