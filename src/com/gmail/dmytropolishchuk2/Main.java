package com.gmail.dmytropolishchuk2;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Thread[] th = new Thread[100];

		for (int i = 0; i < th.length; i++) {
			th[i] = new Thread(new FactorialThreadHome());
			th[i].start();
			th[i].join();
		}

	}
}
