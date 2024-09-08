//package org.example.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServicesTest {
//
//    @BeforeClass
//    public static void init(){
//        System.out.println("Used to call before all unit test-cases....");
//        System.out.println("time : "+new Date());
//    }
//
//    @Before
//    public void beforeEach(){
//        System.out.println("call before the test-case!");
//    }
//
//    @After
//    public void afterEach(){
//        System.out.println("call after the test-case!");
//    }
//
//
//
//    @Test
//    public void addTwoNumberTest(){
//        int i= CalculatorServices.addTwoNumber(1, 2);
//        int expected=3;
//        Assert.assertEquals(expected,i);
//    }
//
//    @Test
//    public void sumAnyNumber(){
//        int i = CalculatorServices.sumAnyNumber(1,2,3,4);
//        int expected=10;
//        Assert.assertEquals(expected,i);
//    }
//
//    @Test(timeout = 2000)
//    public void dividedNumber(){
//        int i= CalculatorServices.dividedTwoNumber(4, 2);
//        Assert.assertEquals(2,i);
//    }
//
//
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("after the all testcase! cleanup");
//        System.out.println("time : "+new Date());
//    }
//}
