package com.github.chengzhx76.shop.common.exception;

/**
 * 错误消息 包装类
 * @author Cheng
 */
public class ErrorEntity {

	private String errcode;
	private String errmsg;
	
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
}
