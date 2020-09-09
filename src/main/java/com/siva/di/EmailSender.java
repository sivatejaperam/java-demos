package com.siva.di;

public class EmailSender implements MessageSender {


	@Override
	public void sendMessage(String messaage, String emailid) {
		System.out.println("sending email: "+messaage+" to "+ emailid);	
	}


}

