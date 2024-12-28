package com.lld.SocialMedia.Factory;

import com.lld.SocialMedia.Entity.Profile;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class ProfileFactory {
    public static Profile getProfile(String profilePicLink, String bio, String intrest, String userId) {
        Profile profile = new Profile(profilePicLink, bio, intrest, userId);
        SocialMediaRepository.addProfile(profile);
        return profile;
    }
}
