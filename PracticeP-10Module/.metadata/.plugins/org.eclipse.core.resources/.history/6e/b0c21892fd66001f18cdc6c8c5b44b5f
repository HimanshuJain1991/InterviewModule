package com.rays.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Marksheet implements Serializable {
	public String name = null;
	public int maths = 0;
	public int java = 0;
	public transient int english = 0;
}

public class TransientExample1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("E:\\Himanshu\\Marksheet1.txt");
		ObjectOutputStream objStream = new ObjectOutputStream(out);
		Marksheet marks = new Marksheet();
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
