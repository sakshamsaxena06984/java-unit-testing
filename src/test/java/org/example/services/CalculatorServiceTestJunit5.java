package org.example.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {

    @BeforeAll
    public static void init(){
        System.out.println("initialize method");
    }


    @AfterAll
    public static void cleanup(){
        System.out.println("cleanup method");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each !");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each !");
    }

    @Test
    @DisplayName("custom_image")
    @Disabled
    public void addTwoNumber(){
        int i= CalculatorServices.addTwoNumber(1, 2);
        Assertions.assertEquals(3,i,"not matching..");
    }

    @Test
    public void productTwoNumber(){
        int i= CalculatorServices.productTwoNumber(2, 4);
        Assertions.assertEquals(8,i);

    }
}
