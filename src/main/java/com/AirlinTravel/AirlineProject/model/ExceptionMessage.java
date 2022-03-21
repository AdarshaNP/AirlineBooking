package com.AirlinTravel.AirlineProject.model;

import java.time.LocalDateTime;

public class ExceptionMessage {

	private String msg;
	private Exception e;
	private LocalDateTime time;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Exception getE() {
		return e;
	}

	public void setE(Exception e) {
		this.e = e;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "ErrorMessage [msg=" + msg + ", e=" + e + ", time=" + time + "]";
	}

	public ExceptionMessage(String msg, Exception e, LocalDateTime time) {
		super();
		this.msg = msg;
		this.e = e;
		this.time = time;
	}

	public ExceptionMessage() {
	}

}
