package com.go4mi.entity.tool.baidu.ipaddress;

public class BaiduAddress {
	private String address;
	private Content content;
	private String status;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BaiduAddress [address=" + address + ", content=" + content + ", status=" + status + "]";
	}

}
