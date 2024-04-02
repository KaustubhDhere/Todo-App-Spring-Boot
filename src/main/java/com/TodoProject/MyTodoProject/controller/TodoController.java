package com.TodoProject.MyTodoProject.controller;

import com.TodoProject.MyTodoProject.model.Todo;
import com.TodoProject.MyTodoProject.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private  TodoService todoService;

    @PostMapping
    public String createTodo(@RequestBody Todo todo) {
        todoService.createService(todo);
        return "Successfully Todo get added" ;
    }

    @GetMapping
    public List<Todo> getTodo() {

        return todoService.getService();
    }

    @PutMapping("{id}")
    public Todo updateTodo(@PathVariable Integer id,@RequestBody Todo updatedTodo){

        return todoService.updateService(id,updatedTodo);
    }

    @DeleteMapping("{id}")
    public String deleteTodo(@PathVariable Integer id){

     return todoService.deleteService(id);
    }
}
