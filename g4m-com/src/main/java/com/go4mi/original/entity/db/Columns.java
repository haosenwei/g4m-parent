package com.go4mi.original.entity.db;

public class Columns {

	private String tableCatalog;// varchar
	private String tableSchema;// varchar
	private String tableName;// varchar
	private String columnName;// varchar
	private Long ordinalPosition = 0l;// bigint
	private String columnDefault;// longtext
	private String isNullable;// varchar
	private String dataType;// varchar
	private Long characterMaximumLength;// bigint
	private Long characterOctetLength;// bigint
	private Long numericPrecision;// bigint
	private Long numericScale;// bigint
	private Long datetimePrecision;// bigint
	private String characterSetName;// varchar
	private String collationName;// varchar
	private String columnType;// longtext
	private String columnKey;// varchar
	private String extra;// varchar
	private String privileges;// varchar
	private String columnComment;// varchar
	private String generationExpression;// longtext

	public String getTableCatalog() {
		return tableCatalog;
	}

	public void setTableCatalog(String tableCatalog) {
		this.tableCatalog = tableCatalog;
	}

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Long getOrdinalPosition() {
		return ordinalPosition;
	}

	public void setOrdinalPosition(Long ordinalPosition) {
		this.ordinalPosition = ordinalPosition;
	}

	public String getColumnDefault() {
		return columnDefault;
	}

	public void setColumnDefault(String columnDefault) {
		this.columnDefault = columnDefault;
	}

	public String getIsNullable() {
		return isNullable;
	}

	public void setIsNullable(String isNullable) {
		this.isNullable = isNullable;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Long getCharacterMaximumLength() {
		return characterMaximumLength;
	}

	public void setCharacterMaximumLength(Long characterMaximumLength) {
		this.characterMaximumLength = characterMaximumLength;
	}

	public Long getCharacterOctetLength() {
		return characterOctetLength;
	}

	public void setCharacterOctetLength(Long characterOctetLength) {
		this.characterOctetLength = characterOctetLength;
	}

	public Long getNumericPrecision() {
		return numericPrecision;
	}

	public void setNumericPrecision(Long numericPrecision) {
		this.numericPrecision = numericPrecision;
	}

	public Long getNumericScale() {
		return numericScale;
	}

	public void setNumericScale(Long numericScale) {
		this.numericScale = numericScale;
	}

	public Long getDatetimePrecision() {
		return datetimePrecision;
	}

	public void setDatetimePrecision(Long datetimePrecision) {
		this.datetimePrecision = datetimePrecision;
	}

	public String getCharacterSetName() {
		return characterSetName;
	}

	public void setCharacterSetName(String characterSetName) {
		this.characterSetName = characterSetName;
	}

	public String getCollationName() {
		return collationName;
	}

	public void setCollationName(String collationName) {
		this.collationName = collationName;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	public String getColumnKey() {
		return columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public String getGenerationExpression() {
		return generationExpression;
	}

	public void setGenerationExpression(String generationExpression) {
		this.generationExpression = generationExpression;
	}

	@Override
	public String toString() {
		return "Columns [tableCatalog=" + tableCatalog + ", tableSchema=" + tableSchema + ", tableName=" + tableName
				+ ", columnName=" + columnName + ", ordinalPosition=" + ordinalPosition + ", columnDefault="
				+ columnDefault + ", isNullable=" + isNullable + ", dataType=" + dataType + ", characterMaximumLength="
				+ characterMaximumLength + ", characterOctetLength=" + characterOctetLength + ", numericPrecision="
				+ numericPrecision + ", numericScale=" + numericScale + ", datetimePrecision=" + datetimePrecision
				+ ", characterSetName=" + characterSetName + ", collationName=" + collationName + ", columnType="
				+ columnType + ", columnKey=" + columnKey + ", extra=" + extra + ", privileges=" + privileges
				+ ", columnComment=" + columnComment + ", generationExpression=" + generationExpression + "]";
	}

}
