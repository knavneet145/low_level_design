package com.lld.SocialMedia.Service;

import com.lld.SocialMedia.Entity.*;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class LikeService {
    public static void like(String sender, Like like) {
        Entity entity = SocialMediaRepository.getEntity(like.getEntityId());
        entity.addLike(like);
    }
}
