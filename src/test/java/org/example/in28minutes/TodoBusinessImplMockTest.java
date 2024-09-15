package org.example.in28minutes;

/**
 * import static org.junit.Assert.assertEquals;
 * import static org.mockito.Mockito.mock;
 * import static org.mockito.Mockito.when;
 */
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.example.in28minutes.TodoService;


public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock(){

//        TodoService mockTodoService= mock(TodoService.class);
//        stub(mockTodoService.retrieveTodos("Parameter")).return("value");

        TodoService todoServiceMock=mock(TodoService.class);
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(Arrays.asList("first String","Second String","third"));


        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        filteredTodos.forEach(e->{
            System.out.println(e);
        });


        assertEquals(2,filteredTodos.size());

    }
}
