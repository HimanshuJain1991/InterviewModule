package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("E:/Himanshu/Writer1.txt");
        PrintWriter pw=new PrintWriter(fw);
        pw.write("Hello Guyss................How are you");
        pw.flush();//it save data in file forcefully from buffer or temperory storage
        System.out.println("Data Saved...");
	}

}
