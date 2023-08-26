package com.nt.test;

import com.nt.beans.Utility;

public class Test {
	public static void getTest() {
		System.out.println("Test.getTest()---hi");
		System.out.println("From Test Class ---line 1");
		System.out.println(new Utility().getDate());
	}

	public void m1() {
		System.out.println("hi from m1()--abcd");
	}
	public static void main(String[] args) {
		Test.getTest();
	}
}
