package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAaaTest {

    private Calculator calculator;

    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();  // Arrange
        System.out.println("Setup completed");
    }

   
    @AfterEach
    void tearDown() {
        System.out.println("Teardown completed");
    }

    @Test
    void testAddition() {
       
        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
       
        int result = calculator.subtract(10, 5);

        
        assertEquals(5, result);
    }

    @Test
    void testDivision() {
        // Act
        int result = calculator.divide(20, 4);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testDivideByZeroThrowsException() {
       
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
