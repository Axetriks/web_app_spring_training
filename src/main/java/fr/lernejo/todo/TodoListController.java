package fr.lernejo.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TodoListController {
    
    public final TodoRepository repo;

    public TodoListController(@Autowired TodoRepository repo){
        this.repo = repo;
    }
    
    @GetMapping(path = "api/todo")
    public ResponseEntity<TodoRepository> getTodo(){
        return new ResponseEntity<>(this.repo, HttpStatus.OK);
    }

    @PostMapping(path = "api/todo",
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
    public void addTodo(@RequestBody Todo newTodo){
        TodoEntity toSave = new TodoEntity(newTodo);
        this.repo.save(toSave); 
    }
}


