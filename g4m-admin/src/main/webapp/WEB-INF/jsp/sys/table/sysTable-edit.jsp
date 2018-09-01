<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="g" uri="/WEB-INF/tlds/g4m.tld" %>

<form class="form-horizontal" id="sysTable_edit_form" role="form">
	<input name="tableId" value="${sysTable.tableId}" type="hidden">
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-tableName">表名称:</label>
				<div class="col-sm-9">
					<input id="form-field-tableName" name="tableName" value="${sysTable.tableName}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-menuName">菜单名字:</label>
				<div class="col-sm-9">
					<input id="form-field-menuName" name="menuName" value="${sysTable.menuName}" class="form-control" type="text">
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-url">链接地址:</label>
				<div class="col-sm-9">
					<input id="form-field-url" name="url" value="${sysTable.url}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
	
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-pid">上级节点:</label>
				<div class="col-sm-9">
					<select id="form-field-pid" name="pid" class="form-control">
					 	<g:select entityName="sysMenu" valueKey="id" valueName="name" valuea="${sysTable.pid}"/>
					</select>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="form-group">
				<label class="col-sm-3 control-label no-padding-right" for="form-field-comment">备注:</label>
				<div class="col-sm-9">
					<input id="form-field-comment" name="comment" value="${sysTable.comment}" class="form-control" type="text">
				</div>
			</div>
		</div>
	
		<div class="col-xs-6"></div>
	</div>
</form>