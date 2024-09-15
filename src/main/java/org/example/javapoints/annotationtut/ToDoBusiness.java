package org.example.javapoints.annotationtut;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {
    public ToDoService toDoService;

    public ToDoBusiness(ToDoService toDoService){
        this.toDoService=toDoService;
    }

    public List<String> getTodosforHibernate(String user){
        List<String> hibernatelist = new ArrayList<String>();
        List<String> Combinedlist = toDoService.getToDoList(user);

        for(String ele:Combinedlist){
            if(ele.contains("Hibernate")){
                hibernatelist.add(ele);
            }
        }
        return hibernatelist;
    }

    public void deleteTodosNotRelatedToHibernate(String user){
        List<String> combination=toDoService.getToDoList(user);
        for(String ele:combination){
            if(!ele.contains("Hibernate")){
                toDoService.deleteTodos(ele);
            }
        }

    }

}
