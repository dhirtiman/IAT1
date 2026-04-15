//q1. explain the concept of passing objects as parameters by adding two distances given in feet and inches

import java.io.*;
import java.util.*;

class Distance {
	private int feet;
	private int inches;

	public void getDistance(Scanner sc) {

		System.out.print("Enter feet: ");
		feet = sc.nextInt(); // feet is stored
		System.out.print("Enter inches: ");
		inches = sc.nextInt(); // inches is stored

		feet = feet + (inches / 12);
		inches = inches % 12;
	}

	public void showDistance() {
		System.out.println("Feet: " + feet + "\tInches: " + inches);
	}

	public void addDistance(Distance D1, Distance D2) {
		inches = D1.inches + D2.inches;
		feet = D1.feet + D2.feet + (inches / 12);
		inches = inches % 12;
	}
}

public class AddTwoDistance {
	public static void main(String args[]) {
		try {
			Distance d1 = new Distance();
			Distance d2 = new Distance();
			Distance d3 = new Distance();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first distance: ");
			d1.getDistance(sc);
			System.out.println("Enter second distance: ");
			d2.getDistance(sc);

			d3.addDistance(d1, d2);

			System.out.println("First D: ");
			d1.showDistance();
			System.out.println("Second D: ");
			d2.showDistance();

			System.out.println("Total distance is: ");
			d3.showDistance();
			sc.close();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.toString());
		}
	}
}

/*
 * java AddTwoDistance
 * Enter first distance:
 * Enter feet: 10
 * Enter inches: 2
 * Enter second distance:
 * Enter feet: Exception occurred: java.util.NoSuchElementException
 */