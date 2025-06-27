package com.example;

public class ExternalApi {
    public void sendData(String userId, int amount) {
        // External system call (simulated)
        System.out.println("Sending data to " + userId + ": " + amount);
    }
}
