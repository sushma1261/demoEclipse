package com.flipkart.inheritance;


class Machine {
	Machine() {
		System.out.println("Machine");
	}
}

class Vehicle extends Machine {
	Vehicle() {
		System.out.println("Vehicle");
	}
}

class Car extends Vehicle {
	Car() {
		System.out.println("Car");
	}
	public void display() {
		System.out.println("Car is a vehicle");
	}
}	

public class MultiLevelInheitance {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.display();

	}

}
