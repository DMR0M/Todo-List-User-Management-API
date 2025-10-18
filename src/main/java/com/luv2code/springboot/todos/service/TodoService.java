package com.luv2code.springboot.todos.service;

import com.luv2code.springboot.todos.request.TodoRequest;
import com.luv2code.springboot.todos.response.TodoResponse;

import java.util.List;

public interface TodoService {
    List<TodoResponse> getAllTodos() throws Exception;

    TodoResponse createTodo(TodoRequest todoRequest) throws Exception;

    TodoResponse toggleTodoCompletion(long id) throws Exception;

    void deleteTodo(long id) throws Exception;
}
