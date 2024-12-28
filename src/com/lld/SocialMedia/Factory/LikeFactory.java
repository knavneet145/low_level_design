package com.lld.SocialMedia.Factory;

import com.lld.SocialMedia.Entity.Like;

public class LikeFactory {
    private static long likeId = 0;
    public Like getLike(String entityId, String ownerId) {
        return new Like(String.valueOf(++likeId), entityId, ownerId);
    }
}
