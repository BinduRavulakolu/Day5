package com.capgemini.day5.test;

public class Client {

	public static void main(String[] args) throws Exception {
		MyCalculator calculator=new MyCalculator(5,0);
		long calculated=calculator.power();
		System.out.println("the result is "+calculated);

	}

}
