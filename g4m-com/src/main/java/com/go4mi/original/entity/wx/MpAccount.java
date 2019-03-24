/*
 * FileName：MpAccount.java 
 * <p>
 * Copyright (c) 2017-2020, <a href="http://www.webcsn.com">hermit (794890569@qq.com)</a>.
 * <p>
 * Licensed under the GNU General Public License, Version 3 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/gpl-3.0.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.go4mi.original.entity.wx;


import java.io.Serializable;

/**
 * 微信公众号信息
 */
public class MpAccount implements Serializable{
	private static final long serialVersionUID = -6315146640254918207L;
	
	private String account;//账号
	private String appid;//appid
	private String appsecret;//appsecret
	private String url;//验证时用的url
	private String token;//token
	//ext
	private Integer msgcount;//自动回复消息条数;默认是5条

	public Integer getMsgcount() {
		if(msgcount == null)
			msgcount = 5;//默认5条
		return msgcount;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAppsecret() {
		return appsecret;
	}

	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setMsgcount(Integer msgcount) {
		this.msgcount = msgcount;
	}

}
