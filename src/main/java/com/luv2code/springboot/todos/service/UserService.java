package com.luv2code.springboot.todos.service;

import com.luv2code.springboot.todos.request.PasswordUpdateRequest;
import com.luv2code.springboot.todos.response.UserResponse;

public interface UserService {
    UserResponse getUserInfo() throws Exception;

    void deleteUser() throws Exception;

    void updatePassword(PasswordUpdateRequest passwordUpdateRequest) throws Exception;
}
