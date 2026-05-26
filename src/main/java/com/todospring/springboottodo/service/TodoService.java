package com.todospring.springboottodo.service;


import com.todospring.springboottodo.model.ToDo;
import com.todospring.springboottodo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoService {
    private final TodoRepository repository;

    public TodoService(TodoRepository repository){
        this.repository=repository;
    }

    public ToDo create(ToDo todo){
        return repository.save(todo);
    }

    public List<ToDo> getAll(){
        return repository.findAll();
    }

    public ToDo getById(Long id){
        return repository.findById(id)
                .orElse(null);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
