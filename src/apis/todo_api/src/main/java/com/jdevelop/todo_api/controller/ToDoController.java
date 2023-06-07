package com.jdevelop.todo_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdevelop.todo_api.entity.ToDo;
import com.jdevelop.todo_api.service.ToDoService;

@RestController
@RequestMapping("todo")
public class ToDoController {
    
    final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ToDo> findAll() {
        return service.findAll();
    }

    @PostMapping
    public void save(@RequestBody ToDo todo) {
        service.save(todo);
    }

    @PatchMapping("{id}")
    public void updateStatus(@PathVariable Long id) {
        service.updateStatus(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
