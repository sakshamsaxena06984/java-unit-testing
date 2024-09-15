package org.example.javapoints.stub;

import org.example.javapoints.stub.ToDoService;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {
    @Override
    public List<String> getTodos(String user) {
        return Arrays.asList(" Use Core Java ", " Use string Core ", " Use Hibernate ", " Use string MVC ");
    }
}
