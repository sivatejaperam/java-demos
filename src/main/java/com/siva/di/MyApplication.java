package com.siva.di;

// this is actual consumer application
public class MyApplication implements Consumer  {

	private MessageSender messageSender;
	
	public MyApplication(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	public void processMessage(String message, String emailId) {
		this.messageSender.sendMessage(message, emailId);
	}
	
}
