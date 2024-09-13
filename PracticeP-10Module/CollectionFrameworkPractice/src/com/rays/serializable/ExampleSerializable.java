package com.rays.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Marksheet1 implements Serializable {
	public String name = null;
	public int maths = 0;
	public int english = 0;
	public int java = 0;
}

public class ExampleSerializable {

	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("E:\\Himanshu\\Marksheet.txt");
		ObjectOutputStream objStream = new ObjectOutputStream(out);
		Marksheet1 marks = new Marksheet1();
		marks.name = "Himanshu Jain";
		marks.maths = 100;
		marks.english = 90;
		marks.java = 99;
		objStream.writeObject(marks);
		out.close();
		objStream.close();
		System.out.println("Data write successfully");

	}

}
