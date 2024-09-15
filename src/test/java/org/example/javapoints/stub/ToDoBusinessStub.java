package org.example.javapoints.stub;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

/**
 * Stubs are useful in simple projects and scenarios, but in complex scenarios,
 * we need something more dynamic than stubs.
 * To overcome the drawbacks, mocks came into play instead of stubs.
 */

public class ToDoBusinessStub {

    @Test
    public void Test(){
       ToDoService toDoService=new ToDoServiceStub();
       ToDoBusiness toDoBusiness=new ToDoBusiness(toDoService);
        List<String> result = toDoBusiness.getTodosForSpring("string");

        assertEquals(2,result.size());
        result.stream().forEach(e->{
            System.out.println(e);
        });

    }
}
