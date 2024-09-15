package org.example.javapoints.stub;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
    public ToDoService toDoService;

    public ToDoBusiness(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> getTodosForSpring(String user){
        List<String> retrieveList = new ArrayList<>();
        List<String> toDoList = toDoService.getTodos(user);
        for(String todo : toDoList){
            if (todo.contains("string")){
                retrieveList.add(todo);
            }
        }
        return retrieveList;

    }
}
