<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="g" uri="/g4m" %>
<form class="form-horizontal" id="sysTableField_edit_form" role="form">
	<input name="id" value="${sysTableField.id}" type="hidden">
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-columnName">字段名称:</label>
				<div class="col-sm-9">
					<input id="form-field-columnName" name="columnName" value="${sysTableField.columnName}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-tableId">表名称:</label>
				<div class="col-sm-9">
					<select id="form-field-tableId" name="tableId" class="form-control">
					 	<g:select entityName="sysTable" valueKey="tableId" valueName="tableName" valuea="${sysTableField.tableId}"/>
					</select>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-typeDic">字段类型:</label>
				<div class="col-sm-9">
					<input id="form-field-typeDic" name="typeDic" value="${sysTableField.typeDic}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-flength">字段长度:</label>
				<div class="col-sm-9">
					<input id="form-field-flength" name="flength" value="${sysTableField.flength}" class="form-control" type="text">
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-keyDic">主键标识:</label>
				<div class="col-sm-9">
					<input id="form-field-keyDic" name="keyDic" value="${sysTableField.keyDic}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-jspTypeDic">页面类型:</label>
				<div class="col-sm-9">
					<input id="form-field-jspTypeDic" name="jspTypeDic" value="${sysTableField.jspTypeDic}" class="form-control" type="text">
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-comment">评论:</label>
				<div class="col-sm-9">
					<input id="form-field-comment" name="comment" value="${sysTableField.comment}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-remark">备注:</label>
				<div class="col-sm-9">
					<input id="form-field-remark" name="remark" value="${sysTableField.remark}" class="form-control" type="text">
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-listTypeDic">列表页面展示:</label>
				<div class="col-sm-9">
					<input id="form-field-listTypeDic" name="listTypeDic" value="${sysTableField.listTypeDic}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-addTypeDic">新增页面展示:</label>
				<div class="col-sm-9">
					<input id="form-field-addTypeDic" name="addTypeDic" value="${sysTableField.addTypeDic}" class="form-control" type="text">
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-viewTypeDic">详情页面展示:</label>
				<div class="col-sm-9">
					<input id="form-field-viewTypeDic" name="viewTypeDic" value="${sysTableField.viewTypeDic}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-editTypeDic">修改页面类型:</label>
				<div class="col-sm-9">
					<input id="form-field-editTypeDic" name="editTypeDic" value="${sysTableField.editTypeDic}" class="form-control" type="text">
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-fieldMenuName">菜单名称:</label>
				<div class="col-sm-9">
					<input id="form-field-fieldMenuName" name="fieldMenuName" value="${sysTableField.fieldMenuName}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-orderBy">排序:</label>
				<div class="col-sm-9">
					<input id="form-field-orderBy" name="orderBy" value="${sysTableField.orderBy}" class="form-control" type="text">
				</div>
			</div>
		</div>
	</div>

</form>