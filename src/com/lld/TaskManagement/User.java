package com.lld.TaskManagement;

import java.util.List;

public class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.email = mail;
    }

    public String getId() {
        return id;
    }
}
