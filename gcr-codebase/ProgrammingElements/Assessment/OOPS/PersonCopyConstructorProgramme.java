package ProgrammingElements.Assessment.OOPS;

class PersonCopy {
    String name;
    int age;

    // Parameterized constructor
    PersonCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    PersonCopy(PersonCopy person) {
        this.name = person.name;
        this.age = person.age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        PersonCopy person1 = new PersonCopy("Rahul", 20);
        PersonCopy person2 = new PersonCopy(person1);

        person1.displayPersonDetails();
        System.out.println();
        person2.displayPersonDetails();
    }
}