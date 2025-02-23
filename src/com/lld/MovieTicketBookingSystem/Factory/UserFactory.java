package com.lld.MovieTicketBookingSystem.Factory;

import com.lld.MovieTicketBookingSystem.DAO;
import com.lld.MovieTicketBookingSystem.User;

public class UserFactory {
    private static long id = 0;
    public static User getInstance(String name, String email, String password) {
        User user = new User(String.valueOf(++id),name,email,password);
        DAO.addUser(user);
        return user;
    }
}
