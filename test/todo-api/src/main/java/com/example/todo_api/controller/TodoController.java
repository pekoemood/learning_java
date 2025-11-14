package com.example.todo_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo_api.entity.Todo;
import com.example.todo_api.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

  private final TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping
  public List<Todo> getAllTodos() {
    return todoService.getAllTodos();
  }

  @GetMapping("/{id}")
  public Optional<Todo> getTodoById(@PathVariable Long id) {
    return todoService.getTodoById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Todo createTodo(@RequestBody Todo todo) {
    return todoService.createTodo(todo);
  }

  @PutMapping("/{id}")
  public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
    return todoService.updateTodo(id, todo);
  }

  @DeleteMapping("/{id}")
  public void deleteTodo(@PathVariable Long id) {
    if (!todoService.deleteTodo(id)) {
      throw new RuntimeException("Todo not found");
    }
  }
}
