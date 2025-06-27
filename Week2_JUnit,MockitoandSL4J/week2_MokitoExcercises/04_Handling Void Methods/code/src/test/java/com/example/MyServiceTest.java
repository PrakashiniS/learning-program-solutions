package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class MyServiceTest {

    @Test
    public void testVoidMethodInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub the void method
        doNothing().when(mockApi).logAction(anyString());

        // Step 3: Use the service and verify interaction
        MyService service = new MyService(mockApi);
        service.performAction();

        // Step 4: Verify the interaction
        verify(mockApi).logAction("Action performed");
    }
}
