package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("E:/Himanshu/Demo1.txt");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		//char ch=(char) bufferedReader.read();
		String ch=bufferedReader.readLine();
		System.out.println(ch);
		

	}

}
