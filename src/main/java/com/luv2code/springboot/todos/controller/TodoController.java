package com.luv2code.springboot.todos.controller;


import com.luv2code.springboot.todos.request.TodoRequest;
import com.luv2code.springboot.todos.response.TodoResponse;
import com.luv2code.springboot.todos.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@Tag(name = "Todo REST API Endpoints", description = "Operations for managing user todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @Operation(summary = "Get all todos for user", description = "Fetch all todos from signed in user")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<TodoResponse> getAllTodos() throws Exception {
        return todoService.getAllTodos();
    }

    @Operation(summary = "Create todo for user", description = "Create todo for the signed in user")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public TodoResponse createTodo(@Valid @RequestBody TodoRequest todoRequest) throws Exception {
        return todoService.createTodo(todoRequest);
    }

    @Operation(summary = "Update todo for users", description = "Update todo for the signed in user")
    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/{todoId}")
    public TodoResponse updatedTodoCompletion(@PathVariable @Min(1) long todoId) throws Exception {
        return todoService.toggleTodoCompletion(todoId);
    }

    @Operation(summary = "Delete todo for user", description = "Delete a todo for the signed in user")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{todoId}")
    public void deleteTodo(@PathVariable @Min(1) long todoId) throws Exception {
        todoService.deleteTodo(todoId);
    }
}
