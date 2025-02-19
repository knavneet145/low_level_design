package com.lld.RestaurentManagementSystem.Factory;

import com.lld.RestaurentManagementSystem.User;

public class UserFactory {
    private static long id = 0;
    public static User getUserInstance(String name) {
        return new User(String.valueOf(++id), name);
    }
}
