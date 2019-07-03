package com.example.demo.util;

public class WrapperResult<T> {

	private T result;
	
	private int code;
	
	private String message;

	public static <T> WrapperResult<T> build(T object) {
		WrapperResult<T> wr = new WrapperResult<>();
		wr.setCode(200);
		wr.setMessage("ok");
		wr.result = object;
		return wr;
	}
	
	public T getResult() {
		return result;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
