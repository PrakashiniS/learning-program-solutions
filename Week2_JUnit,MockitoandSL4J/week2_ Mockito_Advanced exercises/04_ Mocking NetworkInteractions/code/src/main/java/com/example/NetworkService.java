package com.example;

public class NetworkService {

    private NetworkClient networkClient;

    public NetworkService(NetworkClient networkClient) {
        this.networkClient = networkClient;
    }

    public String connectToServer() {
        String response = networkClient.connect();
        return "Connected to " + response;
    }
}
