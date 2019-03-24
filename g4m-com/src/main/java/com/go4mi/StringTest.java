package com.go4mi;

import java.util.ArrayList;
import java.util.List;

import com.go4mi.tool.XMLUtil;
import com.go4mi.tool.tpl.DBHelper;
import com.go4mi.tool.tpl.bean.Param;
import com.go4mi.tool.tpl.bean.ParamsEntity;
import com.go4mi.tool.tpl.bean.TableInfo;
import com.go4mi.tool.tpl.bean.Template;

public class StringTest {
	public static void main(String[] args){
//		ParamsEntity paramsEntity = new ParamsEntity();
//		paramsEntity.setDrivername("1");
//		paramsEntity.setJdbcurl("1");
//		paramsEntity.setPassword("2");
//		paramsEntity.setUsername("111");
//		List<Param> list = new ArrayList<Param>();
//		Param a = new Param();
//		a.setName("1");
//		a.setValue("1");
//		Param b = new Param();
//		b.setName("b");
//		b.setValue("b");
//		list.add(a);
//		list.add(b);
//		paramsEntity.getParams().setList(list);
//		
//		TableInfo t1 = new TableInfo();
//		t1.setTable_name("1");
//		t1.setComment("1");
//		paramsEntity.getTables().getTableInfos().add(t1);
//		
//		TableInfo t = new TableInfo();
//		t.setTable_name("1");
//		t.setComment("1");
//		
//		paramsEntity.getTables().getTableInfos().add(t);
//		
//		Template te = new Template();
//		te.getParams().setList(list);
//		te.setPath("path");
//		te.setTargetFilePath("targetFilePath");
//		Template te1 = new Template();
//		te1.getParams().setList(list);
//		te1.setPath("path");
//		te1.setTargetFilePath("targetFilePath");
//		paramsEntity.getTemplates().getTemlates().add(te);
//		paramsEntity.getTemplates().getTemlates().add(te1);
////		new XMLUtil().convertToXml(paramsEntity, "C:\\Users\\hao\\Desktop\\params.xml");
//		
//		
//		
//		
//		Object convertXmlFileToObject = new XMLUtil().convertXmlFileToObject(ParamsEntity.class, "C:\\Users\\hao\\Desktop\\params.xml");
//		
//		System.out.println(convertXmlFileToObject);
		
		
		new DBHelper().createfile("D:\\git\\g4m-parent\\g4m-com\\src\\main\\resources\\tpl.xml");
		
	}
}	
