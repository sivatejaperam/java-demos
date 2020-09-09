package com.siva.threads;

public class MyThread {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				System.out.println("in thread 1");
			}
		});
		th.start();
	}
}
