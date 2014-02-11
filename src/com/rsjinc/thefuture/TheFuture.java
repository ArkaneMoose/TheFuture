package com.rsjinc.thefuture;

public class TheFuture {
	
	public static void main(String[] args) {
		System.out.println("Initiating voice ID");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(".");
				sleep(1000);
			}
			System.out.println("\b\b\b   \b\b\b");
		}
		System.out.println("\rDone.              ");
		System.exit(0);
	}
	
	protected static void sleep(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
