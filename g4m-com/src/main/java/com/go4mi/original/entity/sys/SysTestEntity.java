package com.go4mi.original.entity.sys;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 测试,测试实体类
 * 
 * @author hsw
 *
 */
public class SysTestEntity implements Serializable {


	private Long sysTest ;
	
	
	/**  */
	private Long updateUser;
	
	/**  */
	private Date updateTime;
	
	/**  */
	private Date createTime;
	
	/**  */
	private Long createUser;
	
	
	
	
	
	
	
	/** 姓名 姓名 */
	private String name;

	
	/** get 主键 ***/
	public Long getEntityName() {
		return sysTest;
	}
	
	/** set 主键 ***/
	public void setEntityName (Long sysTest) {
		this.sysTest = sysTest;
	}
	
	/** get 姓名 姓名 ***/
	public String getName() {
		return name;
	}
	
	/** set 姓名 姓名 ***/
	public void setName(String name) {
		this.name = name;
	}
	
	/** get  ***/
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}
	
	/** set  ***/
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	/** get  ***/
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/** set  ***/
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
	/** get  ***/
	public Long getUpdateUser() {
		return updateUser;
	}
	
	/** set  ***/
	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}
	
}