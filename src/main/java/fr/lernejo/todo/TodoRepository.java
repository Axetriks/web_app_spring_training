package fr.lernejo.todo;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface TodoRepository extends CrudRepository<TodoEntity, Long>{

}
