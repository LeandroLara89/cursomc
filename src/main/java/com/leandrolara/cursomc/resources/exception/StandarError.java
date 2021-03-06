package com.leandrolara.cursomc.resources.exception;

import java.io.Serializable;

public class StandarError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStLong;
	public StandarError(Integer status, String msg, Long timeStLong) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStLong = timeStLong;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimeStLong() {
		return timeStLong;
	}
	public void setTimeStLong(Long timeStLong) {
		this.timeStLong = timeStLong;
	}
	 

}
