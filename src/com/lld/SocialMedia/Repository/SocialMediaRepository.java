package com.lld.SocialMedia.Repository;

import com.lld.SocialMedia.Entity.Entity;
import com.lld.SocialMedia.Entity.Profile;
import com.lld.SocialMedia.Entity.User;

import java.util.concurrent.ConcurrentHashMap;

public class SocialMediaRepository {
    private static final ConcurrentHashMap<String, User> userData = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Entity> entities = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Profile> profiles = new ConcurrentHashMap<>();

    public static void addUser(User user) {
        userData.put(user.getId(), user);
    }

    public static void addEntity(Entity entity) {
        entities.put(entity.getId(), entity);
    }

    public static Entity getEntity(String id) {
        return entities.get(id);
    }

    public static User getUser(String id) {
        return userData.get(id);
    }

    public static Profile getProfile(String userId) {
        return profiles.get(userId);
    }

    public static void addProfile(Profile profile) {
        profiles.put(profile.getUserId(), profile);
    }
}
