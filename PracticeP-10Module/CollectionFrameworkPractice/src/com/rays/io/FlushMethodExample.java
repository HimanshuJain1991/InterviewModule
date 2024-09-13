package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class FlushMethodExample {

	public static void main(String[] args)throws IOException {
	FileWriter file=new FileWriter("E:/Himanshu/A.txt");
	file.write("Hello Himanshu");
	file.flush();
	

	}

}
