package org.example.javapoints.argumentcaptor;

import org.example.javapoints.argumentcaptor.ToDoBusiness;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

public class ToDoBusinessMock {

    @Test
    public void delete_todo_bdd_testing_style(){
        ArgumentCaptor<String> argumentCaptor=ArgumentCaptor.forClass(String.class);
        ToDoService toDoService=mock(ToDoService.class);
        List<String> combinedlist = Arrays.asList("Use Hibernate Java",
                "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");
        given(toDoService.getTodos("dummy")).willReturn(combinedlist);
        ToDoBusiness business=new ToDoBusiness(toDoService);
        business.deleteTodosNotRelatedToHibernate("dummy");
        then(toDoService).should().deleteTodos(argumentCaptor.capture());
        assertThat(argumentCaptor.getValue(),is("Use Spring MVC"));

        then(toDoService).should().deleteTodos(argumentCaptor.capture());
        assertThat(argumentCaptor.getAllValues().size(),is(2));


    }
}
