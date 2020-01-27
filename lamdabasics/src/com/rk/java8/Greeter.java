package com.rk.java8;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greet = new Greeter();
		HelloJavaGreeting hello = new HelloJavaGreeting();
		greet.greet(hello);

	}

}
