package com.rays.thread;

public class ThreadCreationWithRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Run Method calling...");

	}

	public static void main(String[] args) {

		ThreadCreationWithRunnable tr = new ThreadCreationWithRunnable();
		Thread t = new Thread(tr);
		t.start();

	}

}
