package com.rays.io;

import java.io.File;

public class FileReadExample {

	public static void main(String[] args) {
		File file = new File("C:/Hello.txt");
		if (file.exists()) {
			System.out.println("Name" + file.getName());
		}
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canRead());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	}

}
