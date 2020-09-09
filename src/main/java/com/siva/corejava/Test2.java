package com.siva.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scn,scn2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean flag = true;
		while (flag) {
			System.out.println("Plese enter values");
			scn = new Scanner(System.in);
			int a = scn.nextInt();
			list.add(a);
			System.out.println("Do you wnat ot continuee ? Y/N");
			scn2 = new Scanner(System.in);
			String continuue = scn2.nextLine();
			if(continuue.equalsIgnoreCase("N")) {
				flag = false;
				int sum = 0;
				for(int number : list) {
					sum = sum+ number;
				}
				System.out.println("sum of your numers is ::"+ sum);
			}
		}
	}
}
