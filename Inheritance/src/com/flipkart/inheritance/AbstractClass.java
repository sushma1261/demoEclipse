package com.flipkart.inheritance;

abstract class Profession {
	abstract public void show();
}


class Doctor extends Profession {
	public void show() {
		System.out.println("Doctor");
	}
}

final class A {
	void display() {
		System.out.println("Class A is final");
	}
}

//class B extends A {
//	void display() {
//		System.out.println("Cannot create this class");
//	}
//}

public class AbstractClass {
	public static void main(String[] args) {
//		Profession p = new Profession();
		Profession d = new Doctor();
		d.show();
		A a = new A();
		a.display();
	}
}
