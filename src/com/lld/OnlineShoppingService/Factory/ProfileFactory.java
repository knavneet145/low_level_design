package com.lld.OnlineShoppingService.Factory;

import com.lld.OnlineShoppingService.DAO;
import com.lld.OnlineShoppingService.Profile;

public class ProfileFactory {
    private static long userId = 0;
    public static Profile getInstance(String userName) {
        Profile user = new Profile(String.valueOf(++userId), userName);
        DAO.addUser(user);
        return user;
    }
}
