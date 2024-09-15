package org.example.javapoints;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ExceptionHandlingTest {

    @Test(expected = RuntimeException.class)
    public void expHandlingTEST(){
        List<String> listMock=mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenThrow(new RuntimeException("Mocking Error..."));
        listMock.get(3);

    }
}
