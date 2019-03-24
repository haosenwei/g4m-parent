package com.go4mi.original.entity.db;

import java.util.Date;

public class Tables {

	private String tableCatalog;// varchar
	private String tableSchema;// varchar
	private String tableName;// varchar
	private String tableType;// varchar
	private String engine;// varchar
	private Long version;// bigint
	private String rowFormat;// varchar
	private Long tableRows;// bigint
	private Long avgRowLength;// bigint
	private Long dataLength;// bigint
	private Long maxDataLength;// bigint
	private Long indexLength;// bigint
	private Long dataFree;// bigint
	private Long autoIncrement;// bigint
	private Date createTime;// datetime
	private Date updateTime;// datetime
	private Date checkTime;// datetime
	private String tableVollation;// varchar
	private String checksum;// bigint
	private String createOptions;// varchar
	private String tableComment;// varchar

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

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getRowFormat() {
		return rowFormat;
	}

	public void setRowFormat(String rowFormat) {
		this.rowFormat = rowFormat;
	}

	public Long getTableRows() {
		return tableRows;
	}

	public void setTableRows(Long tableRows) {
		this.tableRows = tableRows;
	}

	public Long getAvgRowLength() {
		return avgRowLength;
	}

	public void setAvgRowLength(Long avgRowLength) {
		this.avgRowLength = avgRowLength;
	}

	public Long getDataLength() {
		return dataLength;
	}

	public void setDataLength(Long dataLength) {
		this.dataLength = dataLength;
	}

	public Long getMaxDataLength() {
		return maxDataLength;
	}

	public void setMaxDataLength(Long maxDataLength) {
		this.maxDataLength = maxDataLength;
	}

	public Long getIndexLength() {
		return indexLength;
	}

	public void setIndexLength(Long indexLength) {
		this.indexLength = indexLength;
	}

	public Long getDataFree() {
		return dataFree;
	}

	public void setDataFree(Long dataFree) {
		this.dataFree = dataFree;
	}

	public Long getAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(Long autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	

	public String getTableVollation() {
		return tableVollation;
	}

	public void setTableVollation(String tableVollation) {
		this.tableVollation = tableVollation;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getCreateOptions() {
		return createOptions;
	}

	public void setCreateOptions(String createOptions) {
		this.createOptions = createOptions;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	@Override
	public String toString() {
		return "Tables [tableCatalog=" + tableCatalog + ", tableSchema=" + tableSchema + ", tableName=" + tableName
				+ ", tableType=" + tableType + ", engine=" + engine + ", version=" + version + ", rowFormat="
				+ rowFormat + ", tableRows=" + tableRows + ", avgRowLength=" + avgRowLength + ", dataLength="
				+ dataLength + ", maxDataLength=" + maxDataLength + ", indexLength=" + indexLength + ", dataFree="
				+ dataFree + ", autoIncrement=" + autoIncrement + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", checkTime=" + checkTime + ", tableVollation=" + tableVollation + ", checksum="
				+ checksum + ", createOptions=" + createOptions + ", tableComment=" + tableComment + "]";
	}
	
	

}
