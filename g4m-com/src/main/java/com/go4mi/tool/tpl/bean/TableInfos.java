package com.go4mi.tool.tpl.bean;

import java.util.ArrayList;
import java.util.List;

public class TableInfos {
	private List<TableInfo> tableInfos = new ArrayList<TableInfo>();

	public List<TableInfo> getTableInfos() {
		return tableInfos;
	}

	public void setTableInfos(List<TableInfo> tableInfos) {
		this.tableInfos = tableInfos;
	}

	@Override
	public String toString() {
		return "TableInfos [tableInfos=" + tableInfos + "]";
	}
	
	
	
}
