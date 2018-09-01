<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form class="form-horizontal" id="example_add_form" role="form">
	<div class="row">
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-name">姓名</label>
					<div class="col-sm-9">
						<input id="form-field-name" name="name" value="${example.name}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-age">年龄</label>
					<div class="col-sm-9">
						<input id="form-field-age" name="age" value="${example.age}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-date">date</label>
					<div class="col-sm-9">
						<input id="form-field-date" name="date" value="${example.date}" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-createTime">createTime</label>
					<div class="col-sm-9">
						<input id="form-field-createTime" name="createTime" value="${example.createTime}" onclick="WdatePicker({isShowClear:false,dateFmt:'yyyy-MM-dd HH:mm:ss',readOnly:true})" class="form-control" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-xs-6">
			<div class="row">
				<div class="form-group">
					<label class="col-sm-3 control-label no-padding-right" for="form-field-money">money</label>
					<div class="col-sm-9">
						<input id="form-field-money" class="form-control" name="money" value="${example.money}" type="text">
					</div>
				</div>
			</div>
		</div>
	</div>
</form>