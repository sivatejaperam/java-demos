package com.siva.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

 class Base {
	
	 static Base t;
	 static int count = 0;
	 
	public static void main(String[] args) throws InterruptedException {
		Base t1 = new Base();
		t1 = null;
		
		System.gc();
		
		Thread.sleep(1000);
		
		t = null;
		
		System.gc();
		
		Thread.sleep(1000);
		
		System.out.println(count);
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		count ++;
		t  = this;
	}
	
 }
 

 
