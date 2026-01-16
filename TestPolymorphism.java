//6. Write a program to explain the concept of runtime polymorphism in Java.

class Animal {
	// method in the superclass
	public void eat() {
		System.out.println("I can eat");
	}
}

// Dog inherits Animal
class Dog extends Animal {

	// overriding the eat() method
	@Override
	public void eat() {
		System.out.println("I eat dog food");
	}

	// new method in subclass
	public void bark() {
		System.out.println("I can bark");
	}
}

class TestPolymorphism {
	public static void main(String[] args) {
		// create an object of the subclass
		Animal a = new Animal();
		Dog d = new Dog();
		// call the eat() method
		a.eat();
		d.eat();
		d.bark();
	}
}

/*
 * I can eat
 * I eat dog food
 * I can bark
 * 
 */
