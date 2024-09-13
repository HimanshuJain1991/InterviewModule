package com.rays.cloning;

public class ShallowCloning implements Cloneable {
	int a=10;
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShallowCloning s1=new ShallowCloning();
		ShallowCloning s2=(ShallowCloning) s1.clone();
		s1.a=500;
		System.out.println(s1.a);
		System.out.println("clone of s1 in s2 --> "+s2.a);
	}
	

}
