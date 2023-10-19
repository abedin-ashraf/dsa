package OOPS;

public class ClassObjects {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // Created a pen object name p1
        // p1.setColor("Blue");
        // p1.setTip(10);
        // System.out.println(p1.color);
        // System.out.println(p1.tip);

        // BankAccount myaccount = new BankAccount();
        // myaccount.username = "Ashraf1119";
        // myaccount.setPassword("208090");

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor("Black");
        System.out.println(h.color);

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
}

class Pen {
    // Properties & functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}

abstract class Animal {
    String color;

    Animal() {
        this.color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animals eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }

    void changeColor(String color) {
        this.color = color;
    }

    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on two legs");
    }
}

interface chessPlayer {
    void moves();

}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up down left right,diagonal");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up down left right");
    }
}