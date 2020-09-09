package com.siva.di;

public class EmailServiceInjector implements MessageServiceInjector {


	@Override
	public MyApplication getService() {
		return new MyApplication(new EmailSender());
	}
}
