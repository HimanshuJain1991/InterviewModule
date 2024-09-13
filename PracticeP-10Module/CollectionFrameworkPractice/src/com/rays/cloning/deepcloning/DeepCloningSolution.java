package com.rays.cloning.deepcloning;

class CarModel {
	String name = "Thar";
}

public class DeepCloningSolution implements Cloneable {
	CarModel c1 = new CarModel();
	int a = 10;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepCloningSolution ds2=(DeepCloningSolution) super.clone();
		CarModel c1=new CarModel();
		c1.name=this.c1.name;
		ds2.c1=c1;
		return  ds2;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCloningSolution ds1 = new DeepCloningSolution();
		DeepCloningSolution ds2 = (DeepCloningSolution) ds1.clone();
		ds1.a=200;
		System.out.println(ds1.a + " = " + ds2.a);
		ds1.c1.name="BMW";
		System.out.println(ds1.c1.name+" ="+ds2.c1.name);

	}

}
