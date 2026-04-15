
// 8.	Write a program to demonstrate abstract class and abstract methods.
/*
create an abstract classs with methods without body
extend the abstract class in a new class
and provide implementaion for the abstract class methods by overriding and providing body
call the methods by creating an object of the subclass

*/

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class cat extends Animal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says:  meow");
    }
}

class AbstractPrograam {
    public static void main(String[] args) {
        cat c = new cat(); // Create a object
        c.animalSound();
        c.sleep();

    }

}

/*
 * The cat says: meow
 * Zzz
 */