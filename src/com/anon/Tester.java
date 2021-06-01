package com.anon;

public class Tester {
    public static void main(String[] args) {
        Reporter reporter = new Reporter() {
            public void print() {
                System.out.println("Ding dong");
            }
        };

        Reporter reporter2 = new Reporter() {
            @Override
            public void print() {
                System.out.println("Hehehe");
            }
        };
        reporter.print();
        reporter2.print();
    }
}
