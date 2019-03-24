package com.go4mi.original.entity.common;

public class Result {
	/*** 状态 */
	private String status;
	
	/*** 消息 */
	private String message;
	
	/*** 数据 */
	private Object data;
	
	public Result(String message) {
		this.message = message;
	}
	
	
	public Result() {
	}
	
	public Result(String status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
