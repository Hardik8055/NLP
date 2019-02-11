package com.tcs.bmo.exception;

public class BMONlpException extends Exception{
	
	public BMONlpException(String msg) {
		super(msg);
	}

	public BMONlpException(String msg, Throwable error) {
		super(msg, error);
	}
}
