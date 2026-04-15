// 10. write a JAVA program to demonstrate “this” concept.

public class CarDemo {
    public static void main(String[] args) {
        // Create an object (instance) of the Car class

        Car myCar = new Car("Toyota", "Camry", 2024);
        Car otherCar = new Car();

        // Call a method on the object to display its details
        myCar.displayDetails();
        otherCar.show();
    }
}

/*
just create a class with datamembers 
use this keyword to refer to the datamembers 
use this keyword to call the parameterized constructor from the default constructor
use this keywordd to call a method from another methodd in the same class

*/

class Car {
    // Instance variables (attributes)
    String brand;
    String model;
    int year;

    Car() {
        this("Porshe", "911 GT3", 2025);
    }

    // Constructor to initialize the object
    Car(String brand, String model, int year) {
        // 'this' keyword refers to the current object's instance variables
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void show() {
        this.displayDetails();
    }

    // Method (behavior) to display the car's information
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }
}

/*
 * 
 * Brand: Toyota
 * Model: Camry
 * Year: 2024
 * Brand: Porshe
 * Model: 911 GT3
 * Year: 2025
 */