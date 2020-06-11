package com.flipkart.inheritance;


class A1{  
	public void display(){
		System.out.println("Class A1");
	}  
}  
class B1{  
	public void display(){
		System.out.println("Class B1");
	}  
}  

interface A2 {
	public void display();
}

interface B2 {
	public void display();
}

class C implements A2,B2 {
	public void display() {
		System.out.println("Class C");
	}
}
//Not allowed --- Compilation Error
//	class C extends A1,B1 {
//		void display(){
//			System.out.println("Class C");
//		} 
//	}





public class MultipleInheritance {

	public static void main(String[] args) {
		C c = new C();
		c.display();
	}

}
