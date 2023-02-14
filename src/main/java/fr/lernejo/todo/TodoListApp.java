package fr.lernejo.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.*;


@SpringBootApplication
@ComponentScan(value = "fr.lernejo.todo.TodoRepository")
//@EntityScan
public class TodoListApp {
    public static void main(String[] args){
        SpringApplication.run(TodoListApp.class, args);
    }
}
