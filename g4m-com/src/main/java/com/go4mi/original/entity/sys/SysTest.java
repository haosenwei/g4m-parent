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
public class SysTest implements Serializable {


	private Long sysTest ;
	
	
	/**  */
	private Long createUser;
	
	/**  */
	private Date createTime;
	
	/**  */
	private Long updateUser;
	
	/**  */
	private Date updateTime;
	
	/** 姓名 姓名 */
	private String name;

	
	/** get 主键 ***/
	public Long getSysTest() {
		return sysTest;
	}
	
	/** set 主键 ***/
	public void setSysTest (Long sysTest) {
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
	
	/** get  ***/
	public Long getCreateUser() {
		return createUser;
	}
	
	/** set  ***/
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}
	
}