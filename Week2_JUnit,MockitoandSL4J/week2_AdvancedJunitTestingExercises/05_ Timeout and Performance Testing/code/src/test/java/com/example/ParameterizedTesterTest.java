package com.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class ParameterizedTesterTest {

    ParameterizedTester tester = new ParameterizedTester();

    @Test
    void testPerformTaskCompletesWithinTimeout() {
        // ✅ Timeout: 1 second
        assertTimeout(Duration.ofSeconds(1), () -> {
            tester.performTask();
        });
    }
}
