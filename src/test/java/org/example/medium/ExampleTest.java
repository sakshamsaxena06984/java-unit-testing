//package org.example.medium;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;
//
//public class ExampleTest {
//
//    @Test
//    public void Test(){
//        Example example=mock(Example.class);
//        when(example.doSomething()).thenReturn("Hello");
//        assertEquals("Hello", example.doSomething());
//    }
//
//    @Test
//    public void testMethodVerificationTest(){
//        List<String> mockedList=mock(List.class);
//        mockedList.add("a");
//        mockedList.add("b");
//        mockedList.add("c");
//        mockedList.add("c");
//
//        verify(mockedList).add("a");
//        verify(mockedList).add("b");
//        verify(mockedList,times(2)).add("c");
//
//        // verify that the add method was called 4 times in total..
//        verify(mockedList,times(4)).add(anyString());
//
//        // verify that the 'clear' method was not called
//        verify(mockedList, never()).clear();
//
//    }
//
//
//    @Test
//    public void testMethodBehavior(){
//        List<String> mockedList = mock(List.class);
//
//        mockedList.add("a");
//        verify(mockedList).add("a");
//    }
//}
