class Person {
    String name = "Sahana";

    void display() {
        System.out.println(name);
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}
