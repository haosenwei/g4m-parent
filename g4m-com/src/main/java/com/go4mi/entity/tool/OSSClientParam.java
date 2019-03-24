package com.go4mi.entity.tool;

public class OSSClientParam {
	private String endpoint = "oss-cn-beijing.aliyuncs.com";
	private String accessKeyId = "LTAI1WvHhrfg6Iho";
	private String accessKeySecret = "ZWyvORYHPJ3WAOk6LOlLhkBeos1qoG";
	private String bucketName = "prigo4mi";

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getAccessKeyId() {
		return accessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getAccessKeySecret() {
		return accessKeySecret;
	}

	public void setAccessKeySecret(String accessKeySecret) {
		this.accessKeySecret = accessKeySecret;
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

}
