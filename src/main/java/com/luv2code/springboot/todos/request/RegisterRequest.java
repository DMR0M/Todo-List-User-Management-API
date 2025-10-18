package com.luv2code.springboot.todos.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RegisterRequest {
    @NotEmpty
    @Size(min = 2, max = 30, message = "First name must be at least 2 characters long")
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 30, message = "Last name must be at least 2 characters long")
    private String lastName;

    @NotEmpty
    @Email(message = "Invalid email format")
    private String email;

    @NotEmpty
    @Size(min = 5, max = 30, message = "Password must be at least 5 characters long")
    private String password;

    public RegisterRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
