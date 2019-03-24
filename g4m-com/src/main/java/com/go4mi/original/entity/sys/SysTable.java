package com.go4mi.original.entity.sys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 实体类
 * 
 * @author hsw
 *
 */
public class SysTable implements Serializable {

	/** id:id */
	private Long id;

	/** 表名称 */
	private String tableName;

	/** url地址 */
	private String url;

	/** 父节点菜单 */
	private Long pid;

	/** 菜单名称 */
	private String menuName;

	/** 评论 */
	private String comment;

	/** 是否生成菜单 */
	private String menuStatusDic;

	/** 备注 */
	private String remark;

	private List<SysTableField> sysTableFieldList = new ArrayList<SysTableField>();

	/** get id:id ***/
	public Long getId() {
		return id;
	}

	/** set id:id ***/
	public void setId(Long id) {
		this.id = id;
	}

	/** get 表名称 ***/

	public String getTableName() {
		return tableName;
	}

	/** set 表名称 ***/
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/** get url地址 ***/

	public String getUrl() {
		return url;
	}

	/** set url地址 ***/
	public void setUrl(String url) {
		this.url = url;
	}

	/** get 父节点菜单 ***/
	public Long getPid() {
		return pid;
	}

	/** set 父节点菜单 ***/
	public void setPid(Long pid) {
		this.pid = pid;
	}

	/** get 菜单名称 ***/

	public String getMenuName() {
		return menuName;
	}

	/** set 菜单名称 ***/
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/** get 评论 ***/

	public String getComment() {
		return comment;
	}

	/** set 评论 ***/
	public void setComment(String comment) {
		this.comment = comment;
	}

	/** get 是否生成菜单 ***/

	public String getMenuStatusDic() {
		return menuStatusDic;
	}

	/** set 是否生成菜单 ***/
	public void setMenuStatusDic(String menuStatusDic) {
		this.menuStatusDic = menuStatusDic;
	}

	/** get 备注 ***/

	public String getRemark() {
		return remark;
	}

	/** set 备注 ***/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<SysTableField> getSysTableFieldList() {
		return sysTableFieldList;
	}

	public void setSysTableFieldList(List<SysTableField> sysTableFieldList) {
		this.sysTableFieldList = sysTableFieldList;
	}

}