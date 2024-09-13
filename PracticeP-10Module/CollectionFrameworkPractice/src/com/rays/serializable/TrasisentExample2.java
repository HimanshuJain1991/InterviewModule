package com.rays.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//class Marksheet implements Serializable {
//	public String name = null;
//	public int maths = 0;
//	public int java = 0;
//	public transient int english = 0;
//}
class Marks implements Serializable {
	public String name = null;
	public int maths = 0;
	public int english = 0;
	public int java = 0;

}

public class TrasisentExample2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream in = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\File\\Marksheet.txt");
		ObjectOutputStream out = new ObjectOutputStream(in);
	Marks m =new Marks();
		m.name = "Himanshu jain";
		m.maths = 100;
		m.english = 89;
		m.java = 99;
		out.writeObject(m);

		in.close();
		out.close();
		System.out.println("Data write Successfully");

	}

	

}
