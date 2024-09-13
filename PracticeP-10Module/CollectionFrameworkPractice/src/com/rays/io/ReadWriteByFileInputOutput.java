package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteByFileInputOutput {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("E:\\ALL PHOTOS\\Bansal College pic's\\Copy.jpg");
			FileOutputStream output = new FileOutputStream("E:\\ALL PHOTOS\\Bansal College pic's\\CopyNew.jpg");
			int value = input.read();
			while (value != -1) {
				output.write(value);
				value = input.read();
				output.flush();
			}
			System.out.println("File Copy Successfuuly");
			input.close();
			output.close();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
