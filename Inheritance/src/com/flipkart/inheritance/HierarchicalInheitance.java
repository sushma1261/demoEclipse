package com.flipkart.inheritance;

class Fruits {
	public void print() {
		System.out.println("Fruit class");
	}
}


class Mango extends Fruits {
	public void print() {
		System.out.println("Mango Class");
	}
}

class Banana extends Fruits {
	public void print() {
		System.out.println("Banana Class");
	}
}


public class HierarchicalInheitance {

	public static void main(String[] args) {
		System.out.println("Hierarchical Inheritance");
		Fruits f = new Mango();
		f.print();
		f = new Banana();
		f.print();
	}

}
