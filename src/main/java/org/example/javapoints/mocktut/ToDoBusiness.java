package org.example.javapoints.mocktut;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
    public ToDoService doService;

    public ToDoBusiness(ToDoService doService) {
        this.doService = doService;
    }

    public List<String> getTodosforHibernate(String user) {

        List<String> hibernatelist = new ArrayList<String>();
        List<String> Combinedlist = doService.getTodos(user);

        for(String todo: Combinedlist) {
            if(todo.contains("Use")) {
                hibernatelist.add(todo);
            }
        }

        return hibernatelist;
    }

}
