package com.callor.hello.pay;

public class PayE {
public static void main(String[] args) {
	
	int pay = 3587960;
	System.out.println("=================");
	
	System.out.println("5 만원권: " + pay / 50000);
	pay = pay % 50000;
	System.out.println("1 만원권: " + pay / 10000);
	pay = pay % 10000;
	
}
}
