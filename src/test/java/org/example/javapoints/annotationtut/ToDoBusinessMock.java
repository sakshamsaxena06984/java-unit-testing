package org.example.javapoints.annotationtut;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ToDoBusinessMock {
    @Mock
    ToDoService toDoService;

    @InjectMocks
    ToDoBusiness toDoBusiness;

    @Captor
    ArgumentCaptor<String> argumentCaptor;

    @Spy
    ArrayList<String> arrayListSpy;

    @Test
    public void deleteToList_bdd(){
        List<String> combinedlist = Arrays.asList("Use Hibernate Java",
                "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");

        given(toDoService.getToDoList("dummy")).willReturn(combinedlist);

        arrayListSpy.add("Mockito1");
        arrayListSpy.add("Mockito2");
        toDoBusiness.deleteTodosNotRelatedToHibernate("dummy");

        verify(arrayListSpy).add("Mockito1");
        verify(arrayListSpy).add("Mockito2");

        verify(toDoService, times(1)).deleteTodos("Use Spring MVC");
        verify(toDoService, never()).deleteTodos("Use Hibernate Java");
        verify(toDoService, never()).deleteTodos("Use Hibernate");

        assertEquals(2,arrayListSpy.size());
        System.out.println("Testing is working ....");
    }

    @Test
    public void deleteToDoTesting(){
        List<String> combinedlist = Arrays.asList("Use Hibernate Java",
                "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");
        given(toDoService.getToDoList("dummy")).willReturn(combinedlist);
        toDoBusiness.deleteTodosNotRelatedToHibernate("dummy");
        then(toDoService).should().deleteTodos(argumentCaptor.capture());
        assertThat(argumentCaptor.getValue(),is("Use Spring MVC"));
        System.out.println("test is working..");
    }

}
