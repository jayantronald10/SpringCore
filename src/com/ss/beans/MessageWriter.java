package com.ss.beans;

public class MessageWriter {
	private IMessageConverter messageConverter;

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}

	public MessageWriter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}

	public void writeMessage(String message) {
		String cMessage = null;
		cMessage = messageConverter.convertMessage(message);
		System.out.println(cMessage);
	}
}
