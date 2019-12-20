package com.ss.beans;

public class HtmlMessageConverterImpl implements IMessageConverter {

	@Override
	public String convertMessage(String message) {
		return "HTML" + message;
	}

}
