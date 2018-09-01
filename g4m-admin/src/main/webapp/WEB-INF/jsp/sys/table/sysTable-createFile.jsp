<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form class="form-horizontal" id="sysTable_createFile" role="form">
	<div class="row">
		<div class="col-md-12">
			<div class="form-group">
				<label class="col-md-2 control-label no-padding-right" for="form-field-id">id:</label>
				<div class="col-md-10">
					<input id="form-field-id" name="id" value="${id}" class="form-control" type="text">
				</div>
			</div>
		</div>


		<div class="col-md-12">
			<div class="form-group">
				<label class="col-sm-2 control-label no-padding-top" for="duallist">页面类型</label>

				<div class="col-sm-10">
					<select multiple="multiple" size="10" name="names[]" id="duallist">
						<option value="entity">entity</option>
						<option value="controller">controller</option>
						<option value="service">service</option>
						<option value="mapper">mapper</option>
						<option value="xml">xml</option>
						<option value="add">add</option>
						<option value="main">main</option>
						<option value="edit">edit</option>
						<option value="view">view</option>
						<option value="dialog">dialog</option>
					</select>
				</div>
			</div>
		</div>
	</div>
</form>

<script type="text/javascript">
var demo1 = $('select[name="names[]"]').bootstrapDualListbox();
</script>
