package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testMultipleReturnValues() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub multiple returns
        when(mockApi.getStatus()).thenReturn("Pending").thenReturn("Completed");

        // Step 3: Call the service and assert
        MyService service = new MyService(mockApi);
        String result = service.getFirstTwoStatuses();

        // Step 4: Verify output
        assertEquals("Pending & Completed", result);

        // Step 5: Optionally verify the method was called twice
        verify(mockApi, times(2)).getStatus();
    }
}
