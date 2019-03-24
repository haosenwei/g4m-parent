package com.go4mi.original.entity.common;

import java.util.HashMap;
import java.util.Map;

public class MysqlFieldType {
	static Map<String, String> map = new HashMap<String, String>();

	static {
		map.put("1", "bit,boolean,1");
		map.put("2", "boolean,boolean,1");
		
		map.put("3", "tinyint,byte,4");
		map.put("4", "smallint,short,6");
		map.put("5", "mediumint,short,9");
		map.put("6", "integer,int,11");
		map.put("7", "bigint,Long,20");
		map.put("8", "float,double,");
		map.put("9", "double,double,");
		map.put("10", "decimal,java.math.bigdecimal,10,0");
		
		map.put("11", "date,java.sql.date,");
		map.put("12", "time,java.sql.time,");
		map.put("13", "datetime,java.sql.time,");
		map.put("14", "timestamp,java.sql.timestamp,");

		map.put("15", "char,String,1");
		map.put("16", "varchar,String,100");
		map.put("17", "tinyblob,String,");
		map.put("18", "tinytext,java.math.bigdecimal,");
		map.put("19", "blob,blob,");
		map.put("20", "text,byte[],");
		map.put("21", "mediumblob,byte[],");
		map.put("22", "mediumtext,byte[],");
		map.put("23", "longblob,clob,");
		map.put("24", "longtext,array,");
	}
	
	public static String get(String key){
		return map.get(key);
	}
}