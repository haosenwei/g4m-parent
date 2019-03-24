package com.go4mi.tool.tpl.bean;

import java.util.HashMap;
import java.util.Map;


public class TableField {
	static Map<String, String> map=new HashMap<String, String>(); 
	static Map<String, String> jdbcMap=new HashMap<String, String>(); 

	static{
		map.put("BIGINT","Long");
		jdbcMap.put("BIGINT","BIGINT");
		
		map.put("BINARY","byte[]");
		jdbcMap.put("BINARY","BYTE[]");
		
		map.put("BIT","Boolean");
		jdbcMap.put("BIT","BIT");
		
		map.put("BLOB","byte[]");
		jdbcMap.put("BLOB","BLOB");
		
		map.put("CHAR","String");
		jdbcMap.put("CHAR","CHAR");
		
		map.put("CLOB","String");
		jdbcMap.put("CLOB","CLOB");
		
		map.put("DATE","Date");
		jdbcMap.put("DATE","DATE");
		
		map.put("DECIMAL","BigDecimal");
		jdbcMap.put("DECIMAL","DECIMAL");
		
		map.put("DOUBLE","Double");
		jdbcMap.put("DOUBLE","DOUBLE");
		
		map.put("FLOAT","Double");
		jdbcMap.put("FLOAT","FLOAT");
		
		map.put("INTEGER","Integer");
		jdbcMap.put("INTEGER","INTEGER");
		
		map.put("LONGVARBINARY","byte[]");
		jdbcMap.put("LONGVARBINARY","LONGVARBINARY");
		
		map.put("LONGVARCHAR","String");
		jdbcMap.put("LONGVARCHAR","LONGVARCHAR");
		
		map.put("NUMERIC","BigDecimal");
		jdbcMap.put("NUMERIC","NUMERIC");
		
		map.put("OTHER","Object");
		map.put("REAL","Float");
		jdbcMap.put("REAL","REAL");
		
		map.put("SMALLINT","Integer");
		jdbcMap.put("SMALLINT","SMALLINT");
		
		map.put("TIME","Time");
		jdbcMap.put("TIME","TIME");
		
		map.put("DATETIME","Date");
		jdbcMap.put("DATETIME","TIMESTAMP");
		
		map.put("TIMESTAMP","Timestamp");
		jdbcMap.put("TIMESTAMP","TIMESTAMP");
		
		map.put("TINYINT","Integer");
		jdbcMap.put("TINYINT","TINYINT");
		
		map.put("VARBINARY","byte[]");
		jdbcMap.put("VARBINARY","VARBINARY");
		
		map.put("VARCHAR","String");
		jdbcMap.put("VARCHAR","VARCHAR");
		
		map.put("INT","Integer");
		jdbcMap.put("INT","INTEGER");
		
	}
	/**字段名称-->user_name*/
	private String field_name;

	/**字段类型-->int**/
	private String fieldType;

	/**java类型**/
	private String javaType;

	/**java类型**/
	private String fieldTypeU;

	/**字段备注-->年龄**/
	private String comment;

	/**字段备注-->年龄**/
	private String commentOne;



	public String getCommentOne() {
		String[] split = comment.split(":");
		if(1==split.length){
			split=comment.split("：");
		}
		return split[0];
	}

	public void setCommentOne(String commentOne) {
		this.commentOne = commentOne;
	}

	/*** 字段名称大写 */
	private String fieldName;

	/*** 字段名称大写 */
	private String fieldNameU;

	/*** 字段格式 */
	private String format;

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getJavaType() {
		String string = map.get(fieldType.toUpperCase());
		if(null==string){
			string="String";
		}
		return string;
	}

	public String getFieldTypeU() {
		String string = jdbcMap.get(fieldType.toUpperCase());
		if(null==string){
			string="VARCHAR";
		}
		return string.toUpperCase();
	}

	public void setFieldTypeU(String fieldTypeU) {
		this.fieldTypeU = fieldTypeU;
	}

	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getFieldName() {
		String name = getField_name();
		String[] split = name.split("_");
		String target="";
		for (int i = 0; i < split.length; i++) {
			if(i==0){
				target+=split[i];
				continue;
			}
			target+=split[i].substring(0, 1).toUpperCase()+split[i].substring(1, split[i].length());
		}

		return target;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldNameU() {
		String fieldName = getFieldName();
		String newFieldName=fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1, fieldName.length());
		return newFieldName;
	}

	public void setFieldNameU(String fieldNameU) {
		this.fieldNameU = fieldNameU;
	}

	public String getFormat() {
		if(field_name.toUpperCase().contains("TIME")){
			return "@DateTimeFormat(pattern=\"yyyy-MM-dd HH:mm:ss\")";
		}
		return null;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
