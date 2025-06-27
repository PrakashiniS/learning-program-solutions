package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodThrowsException() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the void method to throw an exception
        doThrow(new RuntimeException("Delete failed")).when(mockApi).deleteRecord("123");

        // Step 3: Call the service
        MyService service = new MyService(mockApi);

        // Step 4: Assert exception
        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            service.delete("123");
        });

        assertEquals("Delete failed", ex.getMessage());

        // Step 5: Verify interaction
        verify(mockApi).deleteRecord("123");
    }
}
