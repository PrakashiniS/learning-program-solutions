package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Call methods in a specific order
        MyService service = new MyService(mockApi);
        service.executeWorkflow();

        // Step 3: Verify the interaction order
        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).start();
        inOrder.verify(mockApi).process();
        inOrder.verify(mockApi).end();
    }
}
