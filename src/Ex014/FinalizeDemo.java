package Ex014;

import Ex015.Student;

public class FinalizeDemo {
    public static void main(String[] args) {
        Student d1 = new Student(1);
        d1 = null;
        Student d2 = new Student(2);
        Object d3 = d2;
        d2 = d1;
        System.gc();
    }
}