package org.example.javapoints.verifytut;
import java.util.List;
public interface ToDoService {
    public List<String> getTodos(String user);
    public void deleteTodos(String doString);
}
