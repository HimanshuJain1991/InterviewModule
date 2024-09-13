package com.rays.cloning.deepcloning;

class Car {
	String name = "Thar";
}

public class DeepCloningProblemExample2 implements Cloneable {
	Car c1 = new Car();
	int a = 100;

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCloningProblemExample2 d1 = new DeepCloningProblemExample2();
		DeepCloningProblemExample2 d2 = (DeepCloningProblemExample2) d1.clone();
		//System.out.println(d1==d2);
		d1.a=200; //d2 mai 100 hai change d1 mai hoga
		d1.c1.name="BMW";//problem in this situation because clone create nahi hua eska d2 mai c1 ka;
		System.out.println(d1.a+" = "+d2.a);
		System.out.println(d1.c1.name+" ="+ d2.c1.name);
		
		

	}
	

}
