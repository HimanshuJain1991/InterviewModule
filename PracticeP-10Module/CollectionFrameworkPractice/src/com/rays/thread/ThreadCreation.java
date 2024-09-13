package com.rays.thread;

public class ThreadCreation extends Thread {
	@Override
	public void run() {
		System.out.println("Thread Task run method calling ....");
	}

	public static void main(String[] args) {
		ThreadCreation tc = new ThreadCreation();
		tc.start();

	}

}
