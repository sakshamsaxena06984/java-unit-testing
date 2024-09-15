package org.example.in28minutes;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ListTest {

    @Test
    public void mockListSizeTest(){
        List mockList= mock(List.class);
        when(mockList.size()).thenReturn(3);
        mockList.add("first");
        mockList.forEach(e->{
            System.out.println(e);
        });
        System.out.println(mockList.get(0));
        assertEquals(3,mockList.size());
    }

    @Test
    public void mockListSizeTestv1(){
        List mockList= mock(List.class);
        when(mockList.size()).thenReturn(3).thenReturn(5);
        mockList.add("first");
        mockList.forEach(e->{
            System.out.println(e);
        });
        System.out.println(mockList.get(0));
        assertEquals(3,mockList.size());
        assertEquals(5,mockList.size());
    }


    @Test
    public void mockListGetTest(){
        List mockList= mock(List.class);
        when(mockList.get(0)).thenReturn("Zero");
//        mockList.add("first");
        mockList.forEach(e->{
            System.out.println(e);
        });
        System.out.println(mockList.get(0));
        assertEquals("Zero",mockList.get(0));
        assertEquals(null,mockList.get(1));
    }

    @Test
    public void mockListGetTestv1(){
        List mockList= mock(List.class);
        // Argument Matcher
        when(mockList.get(anyInt())).thenReturn("Zero");
        mockList.forEach(e->{
            System.out.println(e);
        });
        System.out.println(mockList.get(0));
        assertEquals("Zero",mockList.get(0));
        assertEquals("Zero",mockList.get(1));
    }

    // Handling the exception.....

    @Test(expected = RuntimeException.class)
    public void mockListGetTestv2(){
        List mockList= mock(List.class);
        // Argument Matcher
        when(mockList.get(anyInt())).thenThrow(new RuntimeException("Something going in wrong way"));
        mockList.get(0);

    }

}
