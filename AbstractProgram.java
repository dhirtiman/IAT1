
// 8.	Write a program to demonstrate abstract class and abstract methods.


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