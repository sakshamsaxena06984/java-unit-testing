package org.example.javapoints.verifytut;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
public class ToDoBusinessMock {

    @Test
    public void deleteTodosusing_BDD(){
        ToDoService todoService=mock(ToDoService.class);
        List<String> combinedlist =
                Arrays.asList("Use Hibernate Java", "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");
        given(todoService.getTodos("dummy")).willReturn(combinedlist);

        ToDoBusiness toDoBusiness=new ToDoBusiness(todoService);
        toDoBusiness.deleteTodosNotRelatedToHibernate("dummy");
        verify(todoService).deleteTodos("Use Spring MVC");
        verify(todoService, never()).deleteTodos("Use Hibernate Java");
        verify(todoService, never()).deleteTodos("Use Hibernate");

        verify(todoService, times(1)).deleteTodos("Use Spring MVC");

    }
}
