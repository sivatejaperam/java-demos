package com.siva.corejava;

public class TestSynchronization {

	public static void main(String[] args) {
		final myObject obj = new myObject();

		Thread incrementer = new Thread(new Runnable() {

			public void run() {
				while (obj.counter > 0) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				obj.increment();
			}
		});

		Thread decrementer = new Thread(new Runnable() {

			public void run() {
				while (obj.counter == 0) {
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				obj.decrement();

			}
		});

		incrementer.start();
		decrementer.start();

	}

}

class myObject {
	int counter = 0;

	public synchronized void decrement() {
		--this.counter;
		//this.notify();
		System.out.println("Decremented:: " + this.counter);

	}

	public synchronized void increment() {
		++this.counter;
		this.notify();
		System.out.println("Incremented:: " + this.counter);

	}

}