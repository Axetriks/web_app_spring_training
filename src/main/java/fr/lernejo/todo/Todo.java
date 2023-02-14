package fr.lernejo.todo;
import java.lang.String;

public record Todo(String message, String author) {


    public Todo(String message, String author){
        this.message = message;
        this.author = author;
    }

}
