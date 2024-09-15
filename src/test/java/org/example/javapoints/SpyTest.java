package org.example.javapoints;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.spy;
import static org.junit.Assert.*;

public class SpyTest {

    @Test
    public void spyTesting(){
        List spyArray=spy(ArrayList.class);
        assertEquals(0,spyArray.size());
        spyArray.add("hello");
        assertEquals(1,spyArray.size());
    }
}
