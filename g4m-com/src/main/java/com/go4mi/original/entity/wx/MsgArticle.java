/*
 * FileName：MsgArticle.java 
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

import com.go4mi.core.Page;


/**
 *
 * @author hermit
 * @version 2.0
 * @date 2018-04-17 10:54:58
 */
public class MsgArticle  extends Page implements Serializable {

	public Integer getArId() {
		return arId;
	}
	public void setArId(Integer arId) {
		this.arId = arId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public Integer getShowCoverPic() {
		return showCoverPic;
	}
	public void setShowCoverPic(Integer showCoverPic) {
		this.showCoverPic = showCoverPic;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	public String getContentSourceUrl() {
		return contentSourceUrl;
	}
	public void setContentSourceUrl(String contentSourceUrl) {
		this.contentSourceUrl = contentSourceUrl;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public Integer getNewsIndex() {
		return newsIndex;
	}
	public void setNewsIndex(Integer newsIndex) {
		this.newsIndex = newsIndex;
	}
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	private Integer arId;
	private String title;
	private String author;
	private String content;
	private String digest;
	private Integer showCoverPic;
	private String picUrl;
	private String url;
	private String thumbMediaId;
	private String contentSourceUrl;
	private String mediaId;
	private Integer newsIndex;
	private Integer newsId;
}
