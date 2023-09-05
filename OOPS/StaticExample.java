package OOPS;

public class StaticExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student();

    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}