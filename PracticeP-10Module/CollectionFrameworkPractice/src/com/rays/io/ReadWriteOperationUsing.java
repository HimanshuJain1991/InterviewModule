package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWriteOperationUsing {

	public static void main(String[] args) throws IOException {

		System.out.println("Write Something Here");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		FileWriter write = new FileWriter("E:/Himanshu/ABC.txt");
		PrintWriter printwriter = new PrintWriter(write);
		String s = bf.readLine();
		printwriter.println(s);
		s = bf.readLine();
		System.out.println("Data Saved..");
		isr.close();
		bf.close();
		write.close();
		printwriter.close();
	}

}
