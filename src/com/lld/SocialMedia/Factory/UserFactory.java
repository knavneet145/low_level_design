package com.lld.SocialMedia.Factory;

import com.lld.SocialMedia.Repository.SocialMediaRepository;
import com.lld.SocialMedia.Entity.User;

public class UserFactory {
    private static long userId = 0;
    public static User getUser(String name, String email, String password) {
        User user = new User(String.valueOf(++userId),name,email,password);
        SocialMediaRepository.addUser(user);
        return user;
    }
}
