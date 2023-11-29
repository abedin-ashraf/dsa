package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class One {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("kajal", 5));
        pq.add(new Student("mohammed", 1));
        pq.add(new Student("ashraf", 4));
        pq.add(new Student("abedin", 3));
        pq.add(new Student("nurul", 2));
        while (!pq.isEmpty()) {
            System.out.println(pq.remove().name + "->");
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int rank;

    Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student s2) {
        return this.rank - s2.rank;
    }
}
