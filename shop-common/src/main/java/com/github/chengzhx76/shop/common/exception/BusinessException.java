package com.github.chengzhx76.shop.common.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -9213841740412778182L;
	
	private int code;
	private String errorMsg;
	
	public BusinessException(int code, String errorMsg) {
		this.code = code;
		this.errorMsg = errorMsg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
