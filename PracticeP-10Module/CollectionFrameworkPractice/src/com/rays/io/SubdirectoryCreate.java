package com.rays.io;

import java.io.File;

public class SubdirectoryCreate {

	public static void main(String[] args) {
		File file=new File("C:/temp");
		//create subdirectory
				File subDir=new File(file,"test1");
				subDir.mkdir();
				
		String []files=file.list();
		for (String string : files) {
			System.out.println(string);
		}
		

	}

}
