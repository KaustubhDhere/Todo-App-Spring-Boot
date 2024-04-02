package com.TodoProject.MyTodoProject.model;

public class Todo {

    private Integer id;

    private String content;

    public Todo(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Todo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
