package com.todospring.springboottodo.controllers;


import com.todospring.springboottodo.model.ToDo;
import com.todospring.springboottodo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service){
        this.service=service;
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo todo){
        return service.create(todo);
    }

    @GetMapping
    public List<ToDo> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ToDo getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
