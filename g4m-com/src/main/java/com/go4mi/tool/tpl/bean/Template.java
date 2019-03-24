package com.go4mi.tool.tpl.bean;

import java.util.ArrayList;
import java.util.List;

public class Template {

	private String path;

	private Params params = new Params();

	private String targetFilePath;
	
	private String targetFileType;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Params getParams() {
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
	}

	public String getTargetFilePath() {
		return targetFilePath;
	}

	public void setTargetFilePath(String targetFilePath) {
		this.targetFilePath = targetFilePath;
	}

	public String getTargetFileType() {
		return targetFileType;
	}

	public void setTargetFileType(String targetFileType) {
		this.targetFileType = targetFileType;
	}

	@Override
	public String toString() {
		return "Template [path=" + path + ", params=" + params + ", targetFilePath=" + targetFilePath
				+ ", targetFileType=" + targetFileType + "]";
	}


	
}
