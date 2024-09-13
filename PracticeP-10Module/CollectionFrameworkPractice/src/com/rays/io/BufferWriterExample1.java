package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample1 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("E:/Himanshu/Writer.txt");
		BufferedWriter bw = new BufferedWriter(fileWriter);
		bw.write("Hello Every One");
		bw.close();
		fileWriter.close();
		System.out.println("data write completed");
	}

}
