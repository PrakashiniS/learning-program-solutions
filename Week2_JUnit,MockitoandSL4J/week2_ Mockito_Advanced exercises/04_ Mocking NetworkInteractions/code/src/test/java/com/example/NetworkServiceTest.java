package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class NetworkServiceTest {

    @Test
    public void testServiceWithMockNetworkClient() {
        // Step 1: Mock the network client
        NetworkClient mockNetworkClient = mock(NetworkClient.class);

        // Step 2: Stub the connect method
        when(mockNetworkClient.connect()).thenReturn("Mock Connection");

        // Step 3: Use mock in the service
        NetworkService networkService = new NetworkService(mockNetworkClient);
        String result = networkService.connectToServer();

        // Step 4: Assert the result
        assertEquals("Connected to Mock Connection", result);
    }
}
