package com.lld.SocialMedia.Factory;

import com.lld.SocialMedia.Constants.PostVisibility;
import com.lld.SocialMedia.Entity.Post;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class PostFactory {
    private static long postId = 0;
    private static long time = 0;
    public static Post getPost(String text, String mediaCloudLink, String userId, PostVisibility visibility) {
        Post post = new Post(String.valueOf(++postId), text, mediaCloudLink, userId, visibility, ++time);
        SocialMediaRepository.addEntity(post);
        return post;
    }
}
