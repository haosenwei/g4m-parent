package com.go4mi.tool.file;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.log4j.Logger;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.GetObjectRequest;
import com.aliyun.oss.model.OSSObject;
import com.go4mi.original.entity.common.Result;
import com.go4mi.entity.tool.OSSClientParam;

public class FileUtilsServiceImpl {

	private static Logger log = Logger.getLogger(FileUtilsServiceImpl.class);

	private OSSClient getOssClient(OSSClientParam oSSClientParam) {
		return new OSSClient(oSSClientParam.getEndpoint(), oSSClientParam.getAccessKeyId(),
				oSSClientParam.getAccessKeySecret());
	}

	/**
	 * 读取文本
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String downloadStringImpl(OSSClientParam oSSClientParam, String key) {
		OSSClient ossClient = getOssClient(oSSClientParam);
		StringBuffer str = new StringBuffer();
		try {
			OSSObject ossObject = ossClient.getObject(oSSClientParam.getBucketName(), key);
			BufferedReader reader = new BufferedReader(new InputStreamReader(ossObject.getObjectContent()));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				str.append(line);
			}
			reader.close();
		} catch (OSSException oe) {
			log.error("Error Message: " + oe.getErrorCode());
		} catch (ClientException ce) {
			log.error("Error Message: " + ce.getMessage());
		} catch (IOException ie) {
			log.error("Error Message: " + ie.getMessage());
		} finally {
			ossClient.shutdown();
		}
		return str.toString();
	}

	/**
	 * 下载文件到本地
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param localFile
	 * @throws IOException
	 */
	public void downloadToLocalFileImpl(OSSClientParam oSSClientParam, String key, String localFile) {
		OSSClient ossClient = getOssClient(oSSClientParam);
		try {
			ossClient.getObject(new GetObjectRequest(oSSClientParam.getBucketName(), key), new File(localFile));
		} catch (OSSException oe) {
			log.error("Error Message: " + oe.getErrorCode());
		} catch (ClientException ce) {
			log.error("Error Message: " + ce.getMessage());
		} finally {
			ossClient.shutdown();
		}
	}

	/**
	 * 生成可访问的连接
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param expiratTime
	 * @return
	 * @throws IOException
	 */
	public URL downloadToAllowImpl(OSSClientParam oSSClientParam, String key, Long expiratTime) {
		OSSClient ossClient = getOssClient(oSSClientParam);
		// 设置URL过期时间为1小时
		Date expiration = new Date(new Date().getTime() + expiratTime);
		// 生成URL
		URL url = ossClient.generatePresignedUrl(oSSClientParam.getBucketName(), key, expiration);
		ossClient.shutdown();
		return url;
	}

	/**
	 * 上传字符串
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param content
	 * @return
	 */
	public Result uploadFileStringImpl(OSSClientParam oSSClientParam, String key, String content) {
		OSSClient ossClient = getOssClient(oSSClientParam);
		// 上传
		ossClient.putObject(oSSClientParam.getBucketName(), key, new ByteArrayInputStream(content.getBytes()));
		// 关闭client
		ossClient.shutdown();
		return new Result();
	}

	/**
	 * 上传bytes数组
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param bytes
	 * @return
	 */
	public Result uploadFileBytes(OSSClientParam oSSClientParam, String key, byte[] bytes) {
		OSSClient ossClient = getOssClient(oSSClientParam);
		// 上传
		ossClient.putObject(oSSClientParam.getBucketName(), key, new ByteArrayInputStream(bytes));
		// 关闭client
		ossClient.shutdown();
		return new Result();
	}

	/**
	 * 上传网络流
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param url
	 * @return
	 * @throws IOException
	 * @throws MalformedURLException
	 */
	public Result uploadUrlStream(OSSClientParam oSSClientParam, String key, String url)
			throws MalformedURLException, IOException {
		InputStream inputStream = new URL(url).openStream();
		OSSClient ossClient = getOssClient(oSSClientParam);
		// 上传
		ossClient.putObject(oSSClientParam.getBucketName(), key, inputStream);
		// 关闭client
		ossClient.shutdown();
		return new Result();
	}

	/**
	 * 上传本地文件
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param localFile
	 * @return
	 * @throws FileNotFoundException
	 */
	public Result uploadLocalFile(OSSClientParam oSSClientParam, String key, String localFile)
			throws FileNotFoundException {
		InputStream inputStream = new FileInputStream(localFile);
		OSSClient ossClient = getOssClient(oSSClientParam);
		// 上传
		ossClient.putObject(oSSClientParam.getBucketName(), key, inputStream);
		// 关闭client
		ossClient.shutdown();
		return new Result();
	}

	/**
	 * 上传文件
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param file
	 * @return
	 */
	public Result uploadFile(OSSClientParam oSSClientParam, String key, File file) {
		OSSClient ossClient = getOssClient(oSSClientParam);
		// 上传
		ossClient.putObject(oSSClientParam.getBucketName(), key, file);
		// 关闭client
		ossClient.shutdown();
		return new Result();
	}

	/**
	 * 上传文件流
	 * 
	 * @param ossClient
	 * @param bucketName
	 * @param key
	 * @param inputStream
	 * @return
	 */
	public Result uploadInputStream(OSSClientParam oSSClientParam, String key, InputStream inputStream) {
		OSSClient ossClient = getOssClient(oSSClientParam);
		// 上传
		ossClient.putObject(oSSClientParam.getBucketName(), key, inputStream);
		// 关闭client
		ossClient.shutdown();
		return new Result();
	}
}
