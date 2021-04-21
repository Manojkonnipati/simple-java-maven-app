package com.mycompany.app;

/**
 * Final test
 This is modified by Manoj for final test
This is modified by Manoj by Second time on git client for final test
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
