package com.go4mi.entity.tool.baidu.ipaddress;

public class Content {
	private String address;
	private AddressDetail address_detail;
	private Position point;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AddressDetail getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(AddressDetail address_detail) {
		this.address_detail = address_detail;
	}

	public Position getPoint() {
		return point;
	}

	public void setPoint(Position point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Content [address=" + address + ", address_detail=" + address_detail + ", point=" + point + "]";
	}

}
