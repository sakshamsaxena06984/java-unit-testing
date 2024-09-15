package org.example.javapoints;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class ArgumentMatcherTest {
    @Test
    public void ArMatchTest(){
        List listMock=mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("ArgumentMatcher");
        assertEquals("ArgumentMatcher",listMock.get(0));
        assertEquals("ArgumentMatcher",listMock.get(10));
        assertEquals("ArgumentMatcher",listMock.get(12));
    }
}
