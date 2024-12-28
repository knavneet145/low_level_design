package com.lld.SocialMedia.Service;

import com.lld.SocialMedia.Entity.Comment;
import com.lld.SocialMedia.Entity.Entity;
import com.lld.SocialMedia.Entity.Post;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class CommentService {
    public static void comment(String sender, Comment comment) {
        Entity post = SocialMediaRepository.getEntity(comment.getParentId());
        if (post instanceof Post) {
            ((Post) post).addComment(comment.getId());
        }
    }
}
