package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table(name = "todo")
public class TodoEntity {
    @Id
    public Long id;

    public String message;
    public String author;

    public TodoEntity(Todo newTodo){
        this.message = newTodo.message();
        this.author = newTodo.author();
    }
    
}
