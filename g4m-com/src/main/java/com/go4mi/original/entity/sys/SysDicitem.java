package com.go4mi.original.entity.sys;

import java.io.Serializable;

/**
 * 数据字典项,数据字典项实体类
 * 
 * @author hsw
 *
 */
public class SysDicitem implements Serializable {

	
	/**  主键 */
	private Long id;
	
	/** 名称 名称 */
	private String name;
	
	/** 编码 编码 */
	private String code;
	
	/** 值 值 */
	private String value;
	
	/** 数据字典 数据字典 */
	private Long sysDicId;

	
	/** get  主键 ***/
	public Long getId() {
		return id;
	}
	
	/** set  主键 ***/
	public void setId(Long id) {
		this.id = id;
	}
	/** get 名称 名称 ***/
	public String getName() {
		return name;
	}
	
	/** set 名称 名称 ***/
	public void setName(String name) {
		this.name = name;
	}
	/** get 编码 编码 ***/
	public String getCode() {
		return code;
	}
	
	/** set 编码 编码 ***/
	public void setCode(String code) {
		this.code = code;
	}
	/** get 值 值 ***/
	public String getValue() {
		return value;
	}
	
	/** set 值 值 ***/
	public void setValue(String value) {
		this.value = value;
	}
	/** get 数据字典 数据字典 ***/
	public Long getSysDicId() {
		return sysDicId;
	}
	
	/** set 数据字典 数据字典 ***/
	public void setSysDicId(Long sysDicId) {
		this.sysDicId = sysDicId;
	}
}