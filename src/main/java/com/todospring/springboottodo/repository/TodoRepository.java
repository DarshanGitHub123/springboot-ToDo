package com.todospring.springboottodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todospring.springboottodo.model.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {
}
