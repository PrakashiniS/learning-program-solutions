package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApiServiceTest {

    @Test
    public void testServiceWithMockRestClient() {
        // Step 1: Create a mock REST client
        RestClient mockRestClient = mock(RestClient.class);

        // Step 2: Stub method to return a predefined response
        when(mockRestClient.getResponse()).thenReturn("Mock Response");

        // Step 3: Use mocked client in the service
        ApiService apiService = new ApiService(mockRestClient);
        String result = apiService.fetchData();

        // Step 4: Verify logic
        assertEquals("Fetched Mock Response", result);
    }
}
