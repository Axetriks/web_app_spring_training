package fr.lernejo.todo;

import java.util.ArrayList;
import java.lang.Throwable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerErrorException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TodoListController {
    
    public final ArrayList<Todo> todos;

    public TodoListController(ArrayList<Todo> todos){
        this.todos = todos;
    }
    
    @GetMapping("api/todo")
    public ResponseEntity<ArrayList<Todo>> getTodo(){
        return new ResponseEntity<>(this.todos, HttpStatus.OK);
    }

    @PostMapping(path = "api/todo",
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
    public void addTodo(@RequestBody Todo newTodo){
        
        if(newTodo == null){
            throw new ServerErrorException("Nothing added", (Throwable) null);
        }else this.todos.add(newTodo);    
    }
}
