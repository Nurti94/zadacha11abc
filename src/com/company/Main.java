package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a=5;
        triangle.b=10;
        triangle.c=2;

        triangle.area(triangle.a, triangle.b, triangle.c);
    }
}
