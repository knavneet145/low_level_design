package com.lld.MusicStreamingService.Factory;

import com.lld.MusicStreamingService.DAO;
import com.lld.MusicStreamingService.UserProfile;

public class ProfileFactory {
    private static long id = 0;
    public static UserProfile getInstance(String name) {
        UserProfile profile = new UserProfile(name,String.valueOf(++id));
        DAO.addUser(profile);
        return profile;
    }
}
