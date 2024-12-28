package com.lld.SocialMedia.Factory;

import com.lld.SocialMedia.Entity.Comment;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class CommentFactory {
    private static long commentId = 0;
    public static Comment getComment(String text) {
        Comment comment = new Comment(String.valueOf(++commentId), text);
        SocialMediaRepository.addEntity(comment);
        return comment;
    }
}
