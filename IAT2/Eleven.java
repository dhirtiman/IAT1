package IAT2;
// Array of objects

public class Eleven {
    public static void main(String[] args) {

        Person[] people = new Person[5];

        people[0] = new Person("Bikash", 99);
        people[1] = new Person("Aswani", 22);
        people[2] = new Person("Sushi", 18);
        people[3] = new Person("Ekwa", 38);
        people[4] = new Person("Man", 10);

        for (Person person : people) {
            person.display();
        }

    }

}

/*
 * Name: Bikash Age: 99
 * Name: Aswani Age: 22
 * Name: Sushi Age: 18
 * Name: Ekwa Age: 38
 * Name: Man Age: 10
 */