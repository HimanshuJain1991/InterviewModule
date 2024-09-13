package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharacterFrimTextFile {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("E://Himanshu//Demo1.txt");
		int i = fileReader.read();
		String s = null;
		char chr;
		System.out.println(i);
		chr = (char) i;
		System.out.println(chr);
		// chr=(char) fileReader.read();

		fileReader.close();
	}

}
