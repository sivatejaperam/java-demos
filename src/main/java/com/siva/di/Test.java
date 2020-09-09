package com.siva.di;

// this will be done by container
public class Test {

	public static void main(String[] args) {
		MessageServiceInjector injector = new EmailServiceInjector();
		MyApplication application =injector.getService();
		application.processMessage("test", "test@test");
		
	}
}
	