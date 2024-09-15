package org.example.javapoints.mocktut;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class TestList {
    @Test
    public void test_list_size(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        listMock.add(2);
        listMock.add(21);
        listMock.add(22);
        listMock.add(23);
        assertEquals(2, listMock.size());
    }
    @Test
    public void test_list_get(){
        List<String> listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("mocking");
        assertEquals("mocking",listMock.get(0));
    }
}
