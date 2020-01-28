package com.rk.java8;

public class Greeter {
	

	public static void main(String[] args) {
		
		Greeting myLamdaFunction = () -> System.out.println("Hello Java8");
		
		myLamdaFunction.perform();
		
		Greeting innerclassGreet = new Greeting() {
			public void perform() {
				System.out.println("Hello inner class Java8");
			}
		};
		
		innerclassGreet.perform();
	}
	
}
