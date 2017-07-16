package com.pintusov.ee.app.exception;

/**
 * Project name: TestEEApp
 * Created by Дмитрий
 * Date: 16.07.2017.
 */
public class MessageException extends Exception {

	public MessageException() {
		super();
	}

	public MessageException(String message) {
		super(message);
	}

	public MessageException(String message, Throwable cause) {
		super(message, cause);
	}
}