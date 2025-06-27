package com.example;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void delete(String id) {
        // Call the void method that will be mocked to throw exception
        api.deleteRecord(id);
    }
}
