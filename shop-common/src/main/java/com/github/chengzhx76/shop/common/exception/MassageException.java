package com.github.chengzhx76.shop.common.exception;

public class MassageException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private int code;
	private String errorMsg;
	
	public MassageException() {
	}
	public MassageException(int code, String errorMsg) {
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
