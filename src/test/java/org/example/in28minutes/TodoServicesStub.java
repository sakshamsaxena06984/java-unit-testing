package org.example.in28minutes;

import java.util.Arrays;
import java.util.List;

public class TodoServicesStub implements TodoService{
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("String First","String Second","Third");
    }

}
