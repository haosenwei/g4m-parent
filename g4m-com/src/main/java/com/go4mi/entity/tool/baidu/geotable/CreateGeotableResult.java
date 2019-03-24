package com.go4mi.entity.tool.baidu.geotable;

public class CreateGeotableResult {
	private int status; // 状态码 int32 0代表成功，其它取值见文档最后状态码说明
	private String message; // 响应的信息
	private String string; // (50) 状态码描述，成功时返回“OK”，失败返回对应信息
	private String id; // 新增的数据表id string 即geotable_id

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CreateGeotableResult [status=" + status + ", message=" + message + ", string=" + string + ", id=" + id
				+ "]";
	}

}
