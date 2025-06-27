package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.process();

        Mockito.verify(mockApi).sendData(ArgumentMatchers.eq("user123"), ArgumentMatchers.eq(500));
    }
}
