package com.lld.SocialMedia.Service;

import com.lld.SocialMedia.Entity.Post;
import com.lld.SocialMedia.Entity.Profile;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class PostService {
    public static void createPost(String owner, Post post) {
        SocialMediaRepository.addEntity(post);
        Profile profile = SocialMediaRepository.getProfile(owner);
        profile.addPost(post.getId());
    }
}
