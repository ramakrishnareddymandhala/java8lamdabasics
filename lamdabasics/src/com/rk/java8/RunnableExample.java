package com.rk.java8;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Print runnable");

			}
		});
		thread.run();

		Thread lamdaThread = new Thread(()->System.out.println("Pring from lamda runnable"));
		lamdaThread.run();
	}

}
