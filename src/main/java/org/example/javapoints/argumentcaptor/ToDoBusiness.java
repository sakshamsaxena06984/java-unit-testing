package org.example.javapoints.argumentcaptor;

import java.util.List;

public class ToDoBusiness {
    public ToDoService toDoService;
    public ToDoBusiness(ToDoService toDoService){
        this.toDoService=toDoService;
    }

    public void deleteTodosNotRelatedToHibernate(String user) {

        List<String> Combinedlist = toDoService.getTodos(user);

        for(String todos:Combinedlist) {
            if(!todos.contains("Hibernate")) {
                toDoService.deleteTodos(todos);
            }
        }
    }
}
