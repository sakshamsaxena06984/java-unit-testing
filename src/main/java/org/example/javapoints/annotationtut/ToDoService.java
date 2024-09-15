package org.example.javapoints.annotationtut;

import java.util.List;

public interface ToDoService {
    public List<String> getToDoList(String user);
    public void deleteTodos(String doString);

}
