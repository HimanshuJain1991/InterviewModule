package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteIntoFile {

	public static void main(String[] args) throws Exception {

		System.out.println("Write Here...Something");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(isr);
		FileWriter fileWriter = new FileWriter("E:/Himanshu/Demo.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		String s = buffer.readLine();
		printWriter.println(s);
		System.out.println("Data Saved.....");
		s = buffer.readLine();
		isr.close();
		buffer.close();
		printWriter.close();
		fileWriter.close();
		
	}

}
