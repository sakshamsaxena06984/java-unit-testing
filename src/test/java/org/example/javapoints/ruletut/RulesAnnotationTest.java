package org.example.javapoints.ruletut;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RulesAnnotationTest {
    @Rule
    public MockitoRule mockitoRule= MockitoJUnit.rule();
    @Mock
    ToDoService toDoService;
    @InjectMocks
    ToDoBusiness toDoBusiness;
    @Captor
    ArgumentCaptor<String> argumentCaptor;

    @Test
    public void deleteTodosusing_BDD() {
        List<String> combinedlist = Arrays.asList("Use Hibernate Java",
                "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");

        given(toDoService.getTodos("dummy")).willReturn(combinedlist);

        toDoBusiness.deleteTodosNotRelatedToHibernate("dummy");
        /**
         *  verify(servicemock, times(1)).deleteTodos("Use Spring MVC");
         *       verify(servicemock, never()).deleteTodos("Use Hibernate Java");
         *       verify(servicemock, never()).deleteTodos("Use Hibernate");
         *                System.out.println("test is working..");
         */
        verify(toDoService, times(1)).deleteTodos("Use Spring MVC");
        verify(toDoService, never()).deleteTodos("Use Hibernate Java");
        verify(toDoService, never()).deleteTodos("Use Hibernate");
        System.out.println("Testing of @Rule Annotation");
    }

    }
