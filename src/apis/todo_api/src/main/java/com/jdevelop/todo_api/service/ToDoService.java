package com.jdevelop.todo_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.jdevelop.todo_api.entity.ToDo;
import com.jdevelop.todo_api.repository.ToDoRepository;

@Service
public class ToDoService {
    
    final ToDoRepository repository;

    public ToDoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public List<ToDo> findAll() {
        return repository.findAll();
    }

    public void save(ToDo todo) {
        repository.save(todo);
    }

    public void updateStatus(Long id) {
        Optional<ToDo> entity = repository.findById(id);
        if (entity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ToDo Não Encontrado!");
        }
        ToDo todo = entity.get();
        todo.done = !todo.done;
        repository.save(todo);
    }

    public void delete(Long id) {
        Optional<ToDo> entity = repository.findById(id);
        if (entity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ToDo Não Encontrado!");
        }
        repository.delete(entity.get());
    }
}
