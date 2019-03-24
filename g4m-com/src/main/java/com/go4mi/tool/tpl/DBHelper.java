package com.go4mi.tool.tpl;

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
import com.go4mi.tool.tpl.bean.ParamsEntity;
import com.go4mi.tool.tpl.bean.TableField;
import com.go4mi.tool.tpl.bean.TableInfo;
import com.go4mi.tool.tpl.bean.Template;

public class DBHelper {
	public Connection conn = null;
	public PreparedStatement pst = null;

	private ParamsEntity databaseinfo = new ParamsEntity();

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public String createfile(String filePath) {
		try {
			say("开始生成文件-------");
			/**
			 * 1,读取配置文件 2,读到数据表 3.查询表结构 4.生成文件
			 */
			readConfig(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}

	private void say(String string) {
		System.out.println(sdf.format(new Date()) + ":" + string);
	}

	private void readConfig( String filePath) throws Exception {
		say("读取配置文件");
		databaseinfo = (ParamsEntity) new XMLUtil().convertXmlFileToObject(ParamsEntity.class, filePath);

		say("配置文件路径：" + filePath);
		say("数据库地址：" + databaseinfo.getJdbcurl());
		say("数据库驱动：" + databaseinfo.getDrivername());
		say("数据库用户名：" + databaseinfo.getUsername());
		say("数据库密码：" + databaseinfo.getPassword());
		boolean flag = false;
		List<TableInfo> tableInfos = databaseinfo.getTables().getTableInfos();
		for (int i = 0; i < tableInfos.size(); i++) {
			TableInfo table = tableInfos.get(i);
			if (!table.isCreate()) {
				continue;
			}
			flag = true;
			TableInfo tableInfo = tableInfos.get(i);
			say("菜单名称：" + tableInfo.getMenuName());
			say("作者：" + tableInfo.getAuthor());
			say("菜单链接地址：" + tableInfo.getUrl());
			createFile(tableInfo);
		}
		if (flag == false) {
			say("xml未配置表：" +filePath);
			throw new Exception("读取配置错误，未配置数据表！");
		}
	}

	private void createFile(TableInfo tableInfo) throws ClassNotFoundException, SQLException {
		queryDatabase(tableInfo);
		List<Template> temlates = databaseinfo.getTemplates().getTemlates();
		
		for (Template template : temlates) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("t", tableInfo);
			map.put("d", databaseinfo);
			String targetFile =  template.getTargetFilePath();  //databaseinfo.getJavapath() + "/" + databaseinfo.getFilePrefix() + "entity/" + tableInfo.getJavaFileSuffix();
			System.out.println(targetFile);
			FreeMarkerHelper.generateRequest(map, template.getPath(), targetFile, tableInfo.getTableNameU() + "."+template.getTargetFileType());
		}
	}


	private void queryDatabase(TableInfo tableInfo) throws ClassNotFoundException, SQLException {
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
			TableField tf = new TableField();
			tf.setField(rs.getString(1));
			String type = rs.getString(2);
			String[] split = type.split("\\(");
			tf.setField(split[0]);
			tf.setComment(rs.getString(9));
			say("表字段名称：" + tf.getField() + ",字段类型：" + tf.getField() + ",字段备注：" + tf.getComment());
			list.add(tf);
		}

		String queryComment = "SELECT table_name,	table_comment FROM	information_schema.TABLES WHERE	table_name = '" + tableInfo.getTable_name() + "'";
		rs = st.executeQuery(queryComment);// 执行sql语句并返回结果集
		say("查询字段结果：");
		while (rs.next())// 对结果集进行遍历输出
		{
			String string = rs.getString(1);
			tableInfo.setComment(string);
			say("备注:" + string);
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