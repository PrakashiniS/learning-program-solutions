package com.example;

public class Source {
    private Respository respository;

    public Source(Respository respository) {
        this.respository = respository;
    }

    public String processData() {
        String data = respository.getData();
        return "Processed " + data;
    }
}
