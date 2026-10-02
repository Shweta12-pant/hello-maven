package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Hello from feature branch! 5 + 7 = " + app.add(5, 7));
    }
}