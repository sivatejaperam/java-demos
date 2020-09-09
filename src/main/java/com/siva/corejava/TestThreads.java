package com.siva.corejava;

public class TestThreads {

	private Integer index;
	
	TestThreads() {
		synchronized (index) {
			
		}
	}
	
	public static void main(String[] args) {
		
	}

	private static void testYield() {
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				
				try {
					Thread.sleep(2000);
					Thread.yield();
					System.out.println("in Thread 1");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				
				try {
					Thread.sleep(1000);
					System.out.println("In Thread 2");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
	}

	private static void testingJoin() {
		final Thread t1 = new Thread(new Runnable() {

			public void run() {
				System.out.println("Thread 1 running");

			}
		});
		final Thread t2 = new Thread(new Runnable() {

			public void run() {
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 2 running");

			}
		});
		Thread t3 = new Thread(new Runnable() {

			public void run() {
				try {
					t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread 3 running");

			}
		});

		t1.start();
		t2.start();
		t3.start();
	}
}
