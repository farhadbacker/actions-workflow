
package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public String getMessage() {
        return "Hello! CI Pipeline is working!";
    }

    public static void main(String[] args) {

        App app = new App();

        System.out.println(app.getMessage());

        int result = app.add(10, 20);

        System.out.println("Addition Result: " + result);
    }
}
