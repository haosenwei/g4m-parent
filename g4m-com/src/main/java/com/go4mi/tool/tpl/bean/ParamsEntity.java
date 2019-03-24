package com.go4mi.tool.tpl.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "config")
public class ParamsEntity {
	/*** 数据库地址 */
	private String jdbcurl;
	/** * 数据库用户名 */
	private String username;
	/*** 数据库密码 */
	private String password;
	/*** 数据库驱动 */
	private String drivername;

	private TableInfos tables = new TableInfos();

	private Templates templates = new Templates();

	private Params params = new Params();

	public String getJdbcurl() {
		return jdbcurl;
	}

	public void setJdbcurl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public TableInfos getTables() {
		return tables;
	}

	public void setTables(TableInfos tables) {
		this.tables = tables;
	}

	public Templates getTemplates() {
		return templates;
	}

	public void setTemplates(Templates templates) {
		this.templates = templates;
	}

	public Params getParams() {
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "ParamsEntity [jdbcurl=" + jdbcurl + ", username=" + username + ", password=" + password
				+ ", drivername=" + drivername + ", tables=" + tables + ", templates=" + templates + ", params="
				+ params + "]";
	}

}
