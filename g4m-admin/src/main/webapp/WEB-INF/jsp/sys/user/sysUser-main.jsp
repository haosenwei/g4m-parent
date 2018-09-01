<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<title>用户表</title>

<div class="row">
	<div class="col-xs-12">
		<div class="row">
			<form id="sysUser_search_form" role="form" >
				<div class="col-md-2">
				<div class="form-group" >
					  <input type="text" class="form-control" onkeypress="if(event.keyCode==13) {aceSearch.click();return false;}"  name="search_name" placeholder="名称"  />
				</div>
				</div>
				<div class="col-md-2">
				<div class="form-group">
			        <button type="button" id="aceSearch" class="btn btn-info btn-sm" data-rel="tooltip" title="查询" >
						<span class="ace-icon fa fa-search icon-on-right bigger-110" ></span>
					</button>
					<button type="button" id="aceAdd" class="btn btn-info btn-sm  btn-success" data-rel="tooltip" title="添加">
						<span class="ace-icon fa fa-plus  icon-on-right bigger-110"  ></span>
					</button>
					<button type="button" id="aceDels" class="btn btn-info btn-sm  btn-pink" data-rel="tooltip" title="删除">
						<span class="ace-icon fa fa-trash-o  icon-on-right bigger-110" ></span>
					</button>
				</div>
				</div>
			</form>
		</div>
		<!-- 查询条件 -->
	</div>
	<div class="col-xs-12">
		<table id="sysUser" class="table table-striped table-bordered table-hover" >
			<thead>
				<tr>
					<td><label class="pos-rel"> <input type="checkbox" class="ace" name="id" /> <span class="lbl"></span>
					</label></td>
					<td>id</td>
					<td>姓名</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</div>
</div>
<script type="text/javascript">
	var scripts = [];
	var table=null;
	$('.page-content').ace_ajax('loadScripts',scripts,function() {
		var columns=[
				{"data" : "id","createdCell" : function(td, cellData,rowData, row,col) {
					createCheckCell(td, cellData,rowData, row,col);
					}
				},
				{"data" : "id"}, 
				{"data" : "name"}, 
				{"data" : "code"}, 
				{"data" : "username"}, 
				{"data" : "password"}, 
				{"data" : "email"}, 
				{"data" : "tel"}, 
				{"data" : "age"}, 
				{"data" : "sysOrgId"}, 
				{"data" : "ownerId"}, 
				{"data" : "createTime"}, 
				{"data" : "modifyTime"}, 
				{"data" : "modifyUserId"}, 
				{"data" : "id","createdCell":function(td, cellData,rowData, row,col){
					createCellAuth(td, cellData,rowData, row,col);
					}
				}
			];
		initMainTable("sysUser","${server}sys/user/search?${_csrf.parameterName}=${_csrf.token}",columns);
	})
	//添加
	$('#aceAdd').on('click',function() {
		aceAdd("添加用户表","${server}sys/user/toAdd?${_csrf.parameterName}=${_csrf.token}","${server}sys/user/doAdd?${_csrf.parameterName}=${_csrf.token}","sysUser",null);
	});
	//修改
	function aceEditf(id) {
		aceEdit(id,"修改用户表","${server}sys/user/toEdit?${_csrf.parameterName}=${_csrf.token}","${server}sys/user/doEdit?${_csrf.parameterName}=${_csrf.token}","sysUser",null);
	}
	//查看
	function aceViewf(id) {
		aceView(id,"查看用户表","${server}sys/user/toView?${_csrf.parameterName}=${_csrf.token}",null);
	}
	//查看
	function aceDel(id) {
		$.get("${server}sys/user/del?ids="+id+"&${_csrf.parameterName}=${_csrf.token}", function(data) {
			showTips(data.message);
		});
	}
	//分页检索
	$('#aceSearch').on('click',function() {
		$('#sysUser').DataTable().ajax.reload();
		showTips();
	});
</script>