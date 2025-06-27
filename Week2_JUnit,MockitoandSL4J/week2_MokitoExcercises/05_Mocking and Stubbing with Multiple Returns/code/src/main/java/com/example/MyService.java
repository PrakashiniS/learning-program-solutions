package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String getFirstTwoStatuses() {
        String first = api.getStatus();
        String second = api.getStatus();
        return first + " & " + second;
    }
}
