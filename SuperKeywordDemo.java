// 5. write a program using "super" keywords in multilevel inheritance for Vehical -> Car -> SportsCar

class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
		System.out.println("Vehicle constructor called");
	}

	void display() {
		System.out.println("Brand: " + brand);
	}
}

class Car extends Vehicle {
	int speed;

	Car(String brand, int speed) {
		super(brand); // calling Vehicle constructor
		this.speed = speed;
		System.out.println("Car constructor called");
	}

	void display() {

		super.display();
		System.out.println("Car Speed: " + this.speed + "km/h");
	}
}

class SportsCar extends Car {
	String model;

	SportsCar(String brand, int speed, String model) {
		super(brand, speed); // calling Car constructor
		this.model = model;
		System.out.println("SportsCar constructor called");
	}

	void display() {

		super.display(); // calling Car displa()
		System.out.println("Sports Car model: " + model);
	}
}

public class SuperKeywordDemo {
	public static void main(String[] args) {
		SportsCar sc = new SportsCar("Porche", 320, "911 GT3");
		sc.display();
	}
}

/*
 * Vehicle constructor called
 * Car constructor called
 * SportsCar constructor called
 * Brand: Porche
 * Car Speed: 320km/h
 * Sports Car model: 911 GT3
 * 
 */