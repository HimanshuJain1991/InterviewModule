package com.rays.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
//		try {
//			FileReader file = new FileReader("E:\\Himanshu\\Hello.txt");
//			int value = file.read();
//			while (value != -1) {
//				System.out.print((char) value);
//				value = file.read();
//			}
//			file.close(); // Don't forget to close the file
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found: " + e.getMessage());
//		} catch (IOException e) {
//			System.out.println("An I/O error occurred: " + e.getMessage());
//		}
		
		FileReader file1=new FileReader("E:\\Himanshu\\Hello.txt");
		Scanner sc=new Scanner(file1);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}
