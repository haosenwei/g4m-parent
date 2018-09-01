<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<title>测试标题</title>

<div class="row">
	<div class="col-xs-12">
		<div class="row">
			<form id="example_search_form" role="form" >
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
		<table id="example_main" class="table table-striped table-bordered table-hover" >
			<thead>
				<tr>
					<td><label class="pos-rel"> <input type="checkbox" class="ace" name="id" /> <span class="lbl"></span>
					</label></td>
					<td>姓名</td>
					<td>年龄</td>
					<td>日期</td>
					<td>日期</td>
					<td>double</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
	</div>
</div>
<script type="text/javascript">
	var scripts = [ "/static/assets/js/jquery.dataTables.bootstrap.min.js" ];
	var table=null;
	$('.page-content').ace_ajax('loadScripts',scripts,function() {
		var columns=[
				{"data" : "id","createdCell" : function(td, cellData,rowData, row,col) {
					$(td).html('<div class="checkbox"><label><input name="form-field-checkbox" value="'+cellData+'" type="checkbox" class="ace"><span class="lbl"></span></label></div>');
					}
				},
				{"data" : "name"}, 
				{"data" : "age"}, 
				{"data" : "age"}, 
				{"data" : "date"},
				{"data" : "createTime","createdCell":function(td, cellData,rowData, row,col){
					var d=formatDateTime(cellData);
					$(td).html(d);
					}
				},
				{"data" : "id","createdCell":function(td, cellData,rowData, row,col){
					createCellAuth(td, cellData,rowData, row,col);
					}
				}
			];
		initMainTable("example_main","/example/search",columns);
	})
	//添加
	$('#aceAdd').on('click',function() {
		aceAdd("添加测试","http://localhost:8080/example/toAdd","http://localhost:8080/example/doAdd","example",null);
	});
	//修改
	function aceEditf(id) {
		aceEdit(id,"添加测试","http://localhost:8080/example/toEdit","http://localhost:8080/example/doEdit","example",null);
	}
	//查看
	function aceViewf(id) {
		aceView(id,"aa","http://localhost:8080/example/toView",null);
	}
	//查看
	function aceDel(id) {
		$.get("http://localhost:8080/example/del?ids="+id, function(data) {
			showTips(data.message);
		});
	}
	//分页检索
	$('#aceSearch').on('click',function() {
		$('#example').DataTable().ajax.reload();
		showTips();
	});
	//创建权限表格
	function createCellAuth(td, cellData,rowData, row,col){
		var auth='<div class="hidden-sm hidden-xs btn-group">'+
		'<button onclick="aceEditf('+cellData+')" class="btn btn-xs btn-warning"><i class="ace-icon fa fa-pencil bigger-120"></i></button>'+
		'<button onclick="aceDel('+cellData+')" class="btn btn-xs btn-danger"><i class="ace-icon fa fa-trash-o bigger-120"></i></button>'+
		'<button onclick="aceViewf('+cellData+')" class="btn btn-xs btn-inf "><i class="ace-icon fa fa-search-plus bigger-120"></i></button>'+
		'</div>'+
		'<div class="hidden-md hidden-lg"><div class="inline pos-rel">'+
		'<button class="btn btn-minier btn-primary dropdown-toggle" data-toggle="dropdown" data-position="auto" aria-expanded="false"><i class="ace-icon fa fa-cog icon-only bigger-110"></i></button>'+
		'<ul class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">'+
			'<li><a href="#" class="tooltip-success" data-rel="tooltip" onclick="aceEditf('+cellData+')" title="修改" data-original-title="Edit"><span class="green"><i class="ace-icon fa fa-pencil-square-o bigger-120"></i></span></a></li>'+
			'<li><a href="#" class="tooltip-error" data-rel="tooltip" onclick="aceDel('+cellData+')" title="删除" data-original-title="Delete"><span class="red"><i class="ace-icon fa fa-trash-o bigger-120"></i></span></a></li>'+
			'<li><a href="#" class="tooltip-info" data-rel="tooltip" onclick="aceViewf('+cellData+')" title="查看" data-original-title="View"><span class="blue"><i class="ace-icon fa fa-search-plus bigger-120"></i></span></a></li></ul>'+
			'</div></div>';
		$(td).html(auth);
	}
</script>

