package com.go4mi.entity.tool.baidu.geotable;

public class GetGeotableParam {
	private String name;
	private String ak = "5ItF0S5pKdufc2fVBmla8OGebP0wpA6Q";

	public GetGeotableParam(String name2) {
		this.name = name2;
	}

	public GetGeotableParam() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	@Override
	public String toString() {
		return "GetGeotableParam [name=" + name + ", ak=" + ak + "]";
	}

}
