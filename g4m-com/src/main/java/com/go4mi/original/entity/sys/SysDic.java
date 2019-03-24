package com.go4mi.original.entity.sys;

import java.io.Serializable;

/**
 * 数据字典,数据字典表实体类
 * 
 * @author hsw
 *
 */
public class SysDic implements Serializable {

	
	/** 主键:id 主键 */
	private Long id;
	
	/** 数据字典名称 数据字典名称 */
	private String name;
	
	/** 编码 编码 */
	private Long code;

	
	/** get 主键:id 主键 ***/
	public Long getId() {
		return id;
	}
	
	/** set 主键:id 主键 ***/
	public void setId(Long id) {
		this.id = id;
	}
	/** get 数据字典名称 数据字典名称 ***/
	public String getName() {
		return name;
	}
	
	/** set 数据字典名称 数据字典名称 ***/
	public void setName(String name) {
		this.name = name;
	}
	/** get 编码 编码 ***/
	public Long getCode() {
		return code;
	}
	
	/** set 编码 编码 ***/
	public void setCode(Long code) {
		this.code = code;
	}
}