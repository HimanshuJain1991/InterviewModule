package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {

//	public static void main(String[] args) throws IOException {
//		FileWriter fileWriter = new FileWriter("E:/Himanshu/New.txt");
////		char []chArray= {'H','I','M','A','N','S','H','U'};
////		///fileWriter.write(chArray);
//
//		System.out.println("Write Something about yourself");
//		Scanner sc = new Scanner(System.in);
//		String data = sc.nextLine();
//		fileWriter.write(data);
//		fileWriter.close();
//		System.out.println("you data is saved in file");
//
//	}
//

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("E:\\Himanshu\\NewFile.txt");
		System.out.println("Writ Here for file.... ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("you typed this data: = " + str);
		writer.write(str);
		str = scan.nextLine();
		writer.close();
		System.out.println("Congraulation your 1st file is created successfully!!!");
	}

}
