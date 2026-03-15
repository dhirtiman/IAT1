package IAT2;

public class Person {
    private int age;
    private String name;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}