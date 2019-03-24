package com.go4mi.tool.tpl.bean;

import java.util.ArrayList;
import java.util.List;

public class Templates {

	
	private List<Template> temlates = new ArrayList<Template>();

	public List<Template> getTemlates() {
		return temlates;
	}

	public void setTemlates(List<Template> temlates) {
		this.temlates = temlates;
	}

	@Override
	public String toString() {
		return "Templates [temlates=" + temlates + "]";
	}
	
	
	
	
}
