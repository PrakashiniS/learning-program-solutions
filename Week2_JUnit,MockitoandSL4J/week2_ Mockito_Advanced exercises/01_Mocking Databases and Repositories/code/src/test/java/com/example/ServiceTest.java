package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testServiceWithMockRespository() {
        // Step 1: Mock the repository
        Respository mockRespository = mock(Respository.class);

        // Step 2: Stub the method
        when(mockRespository.getData()).thenReturn("Mock Data");

        // Step 3: Use mock in the service
        Source service = new Source(mockRespository);
        String result = service.processData();

        // Step 4: Assert the output
        assertEquals("Processed Mock Data", result);
    }
}
