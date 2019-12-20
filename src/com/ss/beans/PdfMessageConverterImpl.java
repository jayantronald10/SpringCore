package com.ss.beans;

public class PdfMessageConverterImpl implements IMessageConverter {

	@Override
	public String convertMessage(String message) {
		return "Pdf" + message;
	}

}
