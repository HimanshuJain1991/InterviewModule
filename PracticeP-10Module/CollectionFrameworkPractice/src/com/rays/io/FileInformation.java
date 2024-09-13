package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInformation {

	public static void main(String[] args) throws Exception {
		File file = new File("E:/Himanshu/Demo.txt");
		if (file.exists()) {
			System.out.println("File Name= " + file.getName());
			System.out.println("File Path= " + file.getAbsolutePath());
			System.out.println("Writable= " + file.canWrite());
			System.out.println("Readable" + file.canRead());
			System.out.println("is directory= " + file.isDirectory());
			System.out.println("is File= " + file.isFile());
			System.out.println("length = " + file.length());
			// System.out.println("modified" + file.lastModified());
			Date d = new Date(file.lastModified());
			System.out.println("modified " + d);
		} else {
			System.out.println("File Not Found");
		}

	}

}
