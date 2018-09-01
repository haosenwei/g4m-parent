<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="g" uri="/g4m" %>

<form class="form-horizontal" id="sysTable_add_form" role="form">
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
					 	<g:select entityName="sysMenu" valueKey="id" valueName="id" valuea="${sysTable.pid}"/>
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
<script type="text/javascript">  
    //页面加载完成后初始化select2控件  
    $(function () {  
        //$("#form-field-pid").select2();  
    });  
</script>  