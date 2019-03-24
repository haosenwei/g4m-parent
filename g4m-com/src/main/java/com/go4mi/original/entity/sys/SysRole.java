package com.go4mi.original.entity.sys;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 角色管理,角色管理实体类
 * 
 * @author hsw
 *
 */
public class SysRole implements Serializable {

	/** 主键 自增 */
	private String id;

	/** 名称 角色名称 */
	private String name;

	/** get 主键 自增 ***/
	public String getId() {
		return id;
	}

	/** set 主键 自增 ***/
	public void setId(String id) {
		this.id = id;
	}

	/** get 名称 角色名称 ***/
	public String getName() {
		return name;
	}

	/** set 名称 角色名称 ***/
	public void setName(String name) {
		this.name = name;
	}
}