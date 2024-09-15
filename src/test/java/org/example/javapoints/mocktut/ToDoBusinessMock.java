package org.example.javapoints.mocktut;

import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class ToDoBusinessMock {

    @Test
    public void testing_Mock(){
        ToDoService todoMock= mock(ToDoService.class);
        List<String> combinedlist =
                Arrays.asList(" Use Core Java ",
                        " Use Spring Core ",
                        " Use w3eHibernate ", " Use Spring MVC ");

        when(todoMock.getTodos("Spring")).thenReturn(combinedlist);

        ToDoBusiness toDoBusiness=new ToDoBusiness(todoMock); // in class, We are using constructor...
        List<String> dummy= toDoBusiness.getTodosforHibernate("Spring");
        System.out.println(dummy);
        assertEquals(4,dummy.size());



    }
}
