package com.SpringBootDemo.dto;

import org.springframework.http.HttpStatus;

public class ResponseStructure<T> {

	private HttpStatus status;
	private String msg;
	private T data;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String string) {
		this.msg = string;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
