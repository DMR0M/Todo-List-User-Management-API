package com.luv2code.springboot.todos.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Embeddable
public class Authority implements GrantedAuthority {

    private String authority;

    public Authority() {/* No Args */}

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
