package com.rays.cloning.deepcloning;

class Test {
	String name = "BMW Car";
}

public class DeepCloning implements Cloneable {
	Test t1=new Test();
	public static void main(String[] args)  throws CloneNotSupportedException{
		DeepCloning d1=new DeepCloning();
		DeepCloning d2=(DeepCloning)d1.clone();
		d1.t1.name="i20";
		System.out.println(d1.t1.name);
		System.out.println(d2.t1.name);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		 DeepCloning d2=(DeepCloning) super.clone();
		 Test t1=new Test();
		 t1.name=this.t1.name;
		 d2.t1=t1;
		return d2;
	}
}
