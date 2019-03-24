package com.go4mi.tool.tpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.go4mi.tool.XMLUtil;
import com.go4mi.tool.tpl.bean.Databaseinfo;
import com.go4mi.tool.tpl.bean.TableField;
import com.go4mi.tool.tpl.bean.TableInfo;



public class DBHelper {
	public Connection conn = null;
	public PreparedStatement pst = null;
	private Databaseinfo databaseinfo=new Databaseinfo();
	private TableInfo tableInfo=new TableInfo();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public String createfile(String name,String filePath) {
		try {
			say("开始生成文件-------");
			exe(name,filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}

	private void say(String string) {
		System.out.println(sdf.format(new Date())+":"+string);
	}
	
	private void readConfig(String name,String filePath ) throws Exception {
		say("读取配置文件");
		databaseinfo=(Databaseinfo) new XMLUtil().convertXmlFileToObject(Databaseinfo.class, filePath);
		say("配置文件路径："+filePath);
		say("数据库地址："+databaseinfo.getJdbcurl());
		say("数据库驱动："+databaseinfo.getDrivername());
		say("网站前缀"+databaseinfo.getPrefix());
		say("数据库用户名："+databaseinfo.getUsername());
		say("数据库密码："+databaseinfo.getPassword());
		say("java目录："+databaseinfo.getJavapath());
		say("jsp目录："+databaseinfo.getJsppath());
		boolean flag=false;
		for (int i = 0; i < databaseinfo.getTable().size(); i++) {
			TableInfo table = databaseinfo.getTable().get(i);
			if (!table.getTable_name().equals(name)) {
				continue;
			}
			flag=true;
			tableInfo=databaseinfo.getTable().get(i);
			say("数据库表名称："+name);
			say("菜单名称："+tableInfo.getMenuName());
			say("作者："+tableInfo.getAuthor());
			say("菜单链接地址："+tableInfo.getUrl());
			break;
		}
		if(flag==false){
			say("xml未配置表："+name);
			throw new Exception("读取配置错误，未配置数据表"+name+"！");
		}
	}

	// localhost指本机，也可以用本地ip地址代替，3306为MySQL数据库的默认端口号，“user”为要连接的数据库名
	// 填入数据库的用户名跟密码
	private void exe(String name,String filePath) throws Exception {
		/**
		 * 1,读取配置文件 
		 * 2,读到数据表 
		 * 3.查询表结构
		 *  4.生成文件
		 */
		readConfig(name,filePath);
		queryDatabase();
		createEntityBean();
		createController();
		createServiceImp();
		createMapper();
		createMapperXml();
		createAddPage();
		createMainPage();
		createEditPage();
		createViewPage();
	}
	
	private void createViewPage() throws IOException {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJsppath()+"/"+tableInfo.getJspFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/view.xml",targetFile,tableInfo.getTableName()+"-view.jsp");
	}
	
	private void createEditPage() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJsppath()+"/"+tableInfo.getJspFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/edit.xml",targetFile,tableInfo.getTableName()+"-edit.jsp");
	}

	private void createMainPage() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJsppath()+"/"+tableInfo.getJspFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/main.xml",targetFile,tableInfo.getTableName()+"-main.jsp");
	}

	private void createAddPage() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJsppath()+"/"+tableInfo.getJspFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/add.xml",targetFile,tableInfo.getTableName()+"-add.jsp");
	}

	private void createMapper() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJavapath()+"/"+databaseinfo.getFilePrefix()+"mapper/"+tableInfo.getJavaFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/mapper.xml",targetFile,tableInfo.getTableNameU()+"Mapper.java");
	}

	private void createMapperXml() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJavapath()+"/"+databaseinfo.getFilePrefix()+"mapper/"+tableInfo.getJavaFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/mapperxml.xml",targetFile,tableInfo.getTableNameU()+"Mapper.xml");
	}

	private void createServiceImp() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJavapath()+"/"+databaseinfo.getFilePrefix()+"service/"+tableInfo.getJavaFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/service.xml",targetFile,tableInfo.getTableNameU()+"ServiceImpl.java");
	}

	private void createController() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJavapath()+"/"+databaseinfo.getFilePrefix()+"controller/"+tableInfo.getJavaFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/controller.xml",targetFile,tableInfo.getTableNameU()+"Controller.java");
	}

	private void createEntityBean() {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("t", tableInfo);
		map.put("d", databaseinfo);
		String targetFile= databaseinfo.getJavapath()+"/"+databaseinfo.getFilePrefix()+"entity/"+tableInfo.getJavaFileSuffix();
		System.out.println(targetFile);
		FreeMarkerHelper.generateRequest(map, "src/main/resources/entity.xml",targetFile,tableInfo.getTableNameU()+".java");
	}

	private void  queryDatabase() throws ClassNotFoundException, SQLException{
		say("读取数据库");
		String sql = "SHOW FULL COLUMNS FROM " + tableInfo.getTable_name();// 编写要执行的sql语句，此处为从user表中查询所有用户的信息
		Class.forName(databaseinfo.getDrivername());// 加载驱动程序，此处运用隐式注册驱动程序的方法
		Connection con = DriverManager.getConnection(databaseinfo.getJdbcurl(), databaseinfo.getUsername(), databaseinfo.getPassword());// 创建连接对象
		Statement st = con.createStatement();// 创建sql执行对象
		ResultSet rs = st.executeQuery(sql);// 执行sql语句并返回结果集
		List<TableField> list = tableInfo.getList();
		say("查询字段结果：");
		while (rs.next())// 对结果集进行遍历输出
		{
			TableField tf=new TableField();
			tf.setField_name(rs.getString(1));
			String type = rs.getString(2);
			String[] split = type.split("\\(");
			tf.setFieldType(split[0]);
			tf.setComment(rs.getString(9));
			say("表字段名称："+tf.getField_name()+",字段类型："+tf.getFieldType()+",字段备注："+tf.getComment());
			list.add(tf);
		}

		String queryComment="SELECT table_name,	table_comment FROM	information_schema.TABLES WHERE	table_name = '"+tableInfo.getTable_name()+"'";
		 rs = st.executeQuery(queryComment);// 执行sql语句并返回结果集
		say("查询字段结果：");
		while (rs.next())// 对结果集进行遍历输出
		{
			String string = rs.getString(1);
			tableInfo.setComment(string);
			say("备注:"+string);
		}
		// 关闭相关的对象
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}