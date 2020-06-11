package com.flipkart.inheritance;


class Animal {
	public void print() {
		System.out.println("Animal class");
	}
}

class Dog extends Animal {
	public void print() {
		System.out.println("Dog Class");
	}
}



public class SingleInheritance {
	public static void main(String[] args) {
		System.out.println("Single Inheritance");
		Animal a = new Dog();
		a.print();
	}
}
