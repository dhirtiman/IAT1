// 7. Write a program to implement the Concept of Interface in Java.
/*
create an interface with methods without body
create a class that implements the interface ,
provide implementation for all methods in the class
create an object of the class and call the methods
this is interfaces in action
*/

interface Animal {
  public void animalSound(); // interface method (does not have a body)

  public void sleep();
}

class Cat implements Animal {
  public void animalSound() {
    // body of animalSound() is provided here
    System.out.println("The cat says: mew");
  }

  public void sleep() {
    // body of sleep()
    System.out.println("Zzz");
  }
}

class InterfaceProgram {
  public static void main(String[] args) {
    Cat c = new Cat(); // create an object
    c.animalSound();
    c.sleep();

  }
}

/*
The cat says: mew
Zzz

*/