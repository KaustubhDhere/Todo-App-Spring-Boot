package com.TodoProject.MyTodoProject.service;

import com.TodoProject.MyTodoProject.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private List<Todo> list=new ArrayList<>();

    public Todo createService(Todo todo){
        list.add(todo);
        return todo;
    }

    public List<Todo> getService(){
        return list;
    }

    public Todo updateService(Integer id,Todo updateTodos){

     Optional<Todo>  upTodo=list.stream().filter(todo -> todo.getId().equals(id)).findFirst();

     upTodo.ifPresent(todo -> todo.setContent(updateTodos.getContent()));

     return upTodo.orElse(null);
    }

    public String  deleteService(Integer id){
        Optional<Todo>  dpTodo=list.stream().filter(todo -> todo.getId().equals(id)).findFirst();

        if (dpTodo.isPresent()) {
            list.remove(dpTodo.get());
            return "Successfully Deleted";

        }
        return "Input is Invalid";
    }


}
