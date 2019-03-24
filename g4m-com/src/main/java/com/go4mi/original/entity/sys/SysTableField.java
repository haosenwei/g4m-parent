package com.go4mi.original.entity.sys;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 字段表,字段表实体类
 * 
 * @author hsw
 *
 */
public class SysTableField implements Serializable {

	/** 主键 自增 */
	private Long id;

	/** 表主键 表主键 */
	private Long tableId;

	/** 表主键 表主键 */
	private String tableName;

	/** 字段名称 字段名称 */
	private String fieldName;

	/** 字段名称 字段名称 */
	private String fieldNameOld;

	/** 字段类型 字段类型 */
	private String typeDic;

	/** 字段长度 字段长度 */
	private String flength;

	/** 主键标识 主键标识 */
	private String keyDic;

	/** 页面类型 页面类型 */
	private String jspTypeDic;

	/** 评论 评论 */
	private String comment;

	/** 备注 备注 */
	private String remark;

	/** 列表页面展示 列表页面展示 */
	private String listTypeDic;

	/** 新增页面展示 新增页面展示 */
	private String addTypeDic;

	/** 详情页面展示 详情页面展示 */
	private String viewTypeDic;

	/** 修改页面类型 修改页面类型 */
	private String editTypeDic;

	/** 菜单名称 菜单名称 */
	private String fieldMenuName;

	/** 排序 排序 */
	private String orderBy;

	/** get 主键 自增 ***/
	public Long getId() {
		return id;
	}

	/** set 主键 自增 ***/
	public void setId(Long id) {
		this.id = id;
	}

	/** get 表主键 表主键 ***/
	public Long getTableId() {
		return tableId;
	}

	/** set 表主键 表主键 ***/
	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	/** get 字段名称 字段名称 ***/
	public String getFieldName() {
		return fieldName;
	}

	/** set 字段名称 字段名称 ***/
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/** get 字段类型 字段类型 ***/
	public String getTypeDic() {
		return typeDic;
	}

	/** set 字段类型 字段类型 ***/
	public void setTypeDic(String typeDic) {
		this.typeDic = typeDic;
	}

	/** get 字段长度 字段长度 ***/
	public String getFlength() {
		return flength;
	}

	/** set 字段长度 字段长度 ***/
	public void setFlength(String flength) {
		this.flength = flength;
	}

	/** get 主键标识 主键标识 ***/
	public String getKeyDic() {
		return keyDic;
	}

	/** set 主键标识 主键标识 ***/
	public void setKeyDic(String keyDic) {
		this.keyDic = keyDic;
	}

	/** get 页面类型 页面类型 ***/
	public String getJspTypeDic() {
		return jspTypeDic;
	}

	/** set 页面类型 页面类型 ***/
	public void setJspTypeDic(String jspTypeDic) {
		this.jspTypeDic = jspTypeDic;
	}

	/** get 评论 评论 ***/
	public String getComment() {
		return comment;
	}

	/** set 评论 评论 ***/
	public void setComment(String comment) {
		this.comment = comment;
	}

	/** get 备注 备注 ***/
	public String getRemark() {
		return remark;
	}

	/** set 备注 备注 ***/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/** get 列表页面展示 列表页面展示 ***/
	public String getListTypeDic() {
		return listTypeDic;
	}

	/** set 列表页面展示 列表页面展示 ***/
	public void setListTypeDic(String listTypeDic) {
		this.listTypeDic = listTypeDic;
	}

	/** get 新增页面展示 新增页面展示 ***/
	public String getAddTypeDic() {
		return addTypeDic;
	}

	/** set 新增页面展示 新增页面展示 ***/
	public void setAddTypeDic(String addTypeDic) {
		this.addTypeDic = addTypeDic;
	}

	/** get 详情页面展示 详情页面展示 ***/
	public String getViewTypeDic() {
		return viewTypeDic;
	}

	/** set 详情页面展示 详情页面展示 ***/
	public void setViewTypeDic(String viewTypeDic) {
		this.viewTypeDic = viewTypeDic;
	}

	/** get 修改页面类型 修改页面类型 ***/
	public String getEditTypeDic() {
		return editTypeDic;
	}

	/** set 修改页面类型 修改页面类型 ***/
	public void setEditTypeDic(String editTypeDic) {
		this.editTypeDic = editTypeDic;
	}

	/** get 菜单名称 菜单名称 ***/
	public String getFieldMenuName() {
		return fieldMenuName;
	}

	/** set 菜单名称 菜单名称 ***/
	public void setFieldMenuName(String fieldMenuName) {
		this.fieldMenuName = fieldMenuName;
	}

	/** get 排序 排序 ***/
	public String getOrderBy() {
		return orderBy;
	}

	/** set 排序 排序 ***/
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getFieldNameOld() {
		return fieldNameOld;
	}

	public void setFieldNameOld(String fieldNameOld) {
		this.fieldNameOld = fieldNameOld;
	}

}