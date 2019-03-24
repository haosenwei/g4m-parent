package com.go4mi.entity.tool.baidu.geotable;

public class CreateGeotableParam {
	private String name;
	private int is_published = 1; // 0：未自动发布到云检索， 1：自动发布到云检索；
	private String ak = "5ItF0S5pKdufc2fVBmla8OGebP0wpA6Q";

	public CreateGeotableParam(String name2) {
		this.name = name2;
	}

	public CreateGeotableParam() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIs_published() {
		return is_published;
	}

	public void setIs_published(int is_published) {
		this.is_published = is_published;
	}

	public String getAk() {
		return ak;
	}

	public void setAk(String ak) {
		this.ak = ak;
	}

	@Override
	public String toString() {
		return "CreateGeotableParam [name=" + name + ", is_published=" + is_published + ", ak=" + ak + "]";
	}

}
