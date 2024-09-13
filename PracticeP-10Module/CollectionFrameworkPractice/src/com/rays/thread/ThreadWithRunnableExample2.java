package com.rays.thread;

public class ThreadWithRunnableExample2 implements Runnable {

	private String name = null;

	public ThreadWithRunnableExample2(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " = " + name);
			
			
		}

	}

	public static void main(String[] args) throws InterruptedException {
		ThreadWithRunnableExample2 tr1 = new ThreadWithRunnableExample2("Ram");
		ThreadWithRunnableExample2 tr2 = new ThreadWithRunnableExample2("Shyam");
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		t1.start();
		t2.wait(2000);
		t2.start();
	
	}

}
