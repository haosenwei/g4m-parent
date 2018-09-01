<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form class="form-horizontal" id="sysUser_edit_form" role="form">
	<div class="row">	
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-id">id:</label>
					<div class="col-sm-9">
						<input id="form-field-id" name="id" value="${sysUser.id}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	
		
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-name">姓名:</label>
					<div class="col-sm-9">
						<input id="form-field-name" name="name" value="${sysUser.name}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">	
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-code">:</label>
					<div class="col-sm-9">
						<input id="form-field-code" name="code" value="${sysUser.code}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	
		
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-username">:</label>
					<div class="col-sm-9">
						<input id="form-field-username" name="username" value="${sysUser.username}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">	
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-password">:</label>
					<div class="col-sm-9">
						<input id="form-field-password" name="password" value="${sysUser.password}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	
		
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-email">:</label>
					<div class="col-sm-9">
						<input id="form-field-email" name="email" value="${sysUser.email}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">	
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-tel">:</label>
					<div class="col-sm-9">
						<input id="form-field-tel" name="tel" value="${sysUser.tel}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	
		
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-age">:</label>
					<div class="col-sm-9">
						<input id="form-field-age" name="age" value="${sysUser.age}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">	
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-sysOrgId">:</label>
					<div class="col-sm-9">
						<input id="form-field-sysOrgId" name="sysOrgId" value="${sysUser.sysOrgId}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	
		
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-ownerId">:</label>
					<div class="col-sm-9">
						<input id="form-field-ownerId" name="ownerId" value="${sysUser.ownerId}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">	
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-createTime">:</label>
					<div class="col-sm-9">
						<input id="form-field-createTime" name="createTime" value="${sysUser.createTime}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	
		
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-modifyTime">:</label>
					<div class="col-sm-9">
						<input id="form-field-modifyTime" name="modifyTime" value="${sysUser.modifyTime}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">	
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-modifyUserId">:</label>
					<div class="col-sm-9">
						<input id="form-field-modifyUserId" name="modifyUserId" value="${sysUser.modifyUserId}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	
		<div class="row"></div>
	</div>
</form>