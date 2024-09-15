package org.example.in28minutes;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class TodoBusinessImplStubTest {

    @Test
    public void test(){
        TodoService todoServiceStub=new TodoServicesStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("String");

        assertEquals(2,filteredTodos.size());
    }
}
