package com.example;

public class ParameterizedTester {

    public void performTask() {
        try {
            // Simulate a task that takes 300 ms
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
