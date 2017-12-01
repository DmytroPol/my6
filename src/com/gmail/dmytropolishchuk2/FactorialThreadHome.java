package com.gmail.dmytropolishchuk2;

import java.math.BigInteger;

public class FactorialThreadHome implements Runnable {

	private BigInteger calculate(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = n; i > 0; i--) {
			fact = fact.multiply(new BigInteger("" + i));

		}
		return fact;
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 100; i++) {

			System.out.println(th.getName() + "->" + i + "! = " + calculate(i));
			if (th.isInterrupted()) {
				System.out.println(th.getName() + " is interrupted");
				return;
			}
		}

	}

}
