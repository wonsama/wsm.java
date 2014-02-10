package com.wonsama.wsm.parse.vo;

public class WsmUrlResultVo
{
	int code;		//response code
	String url;		//call url
	String msg;	//response message
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
