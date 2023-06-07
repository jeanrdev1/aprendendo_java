package com.jdevelop.todo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdevelop.todo_api.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    
}
