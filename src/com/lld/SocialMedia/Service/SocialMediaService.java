package com.lld.SocialMedia.Service;

import com.lld.SocialMedia.Constants.Constants;
import com.lld.SocialMedia.Constants.NotificationType;
import com.lld.SocialMedia.Entity.*;
import com.lld.SocialMedia.Repository.SocialMediaRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SocialMediaService {
    public static void comment(String sender, Comment comment) {
        CommentService.comment(sender, comment);
        Entity parentOfComment = SocialMediaRepository.getEntity(comment.getParentId());
        NotificationService.notify(parentOfComment.getUserId(), sender, NotificationType.COMMENT);
    }

    public static void sendFriendRequest(String sender, String recieverId) {
        FriendRequestService.SendFriendRequest(sender, recieverId);
        NotificationService.notify(recieverId, sender, NotificationType.FRIEND_REQUEST);
    }

    public static void likeEntity(String sender, Like like) {
        LikeService.like(sender, like);
        Entity entity = SocialMediaRepository.getEntity(like.getEntityId());
        NotificationService.notify(entity.getUserId(), sender, NotificationType.LIKE);
    }

    public static void acceptRequest(String sender, String reciever) {
        Profile recieverProfile = SocialMediaRepository.getProfile(reciever);
        Profile senderProfile = SocialMediaRepository.getProfile(sender);
        senderProfile.addFriend(reciever);
        recieverProfile.addFriend(sender);
    }

    public static List<Entity> getNewsFeed(String userId) {
        Profile profile = SocialMediaRepository.getProfile(userId);
        PriorityQueue<Post> feed = new PriorityQueue<>((a, b) -> (int)(a.getTimeStamp() - b.getTimeStamp()));
        for (String friend: profile.getFriends()) {
            for(String postId: SocialMediaRepository.getProfile(friend).getPosts()) {
                Entity post = SocialMediaRepository.getEntity(postId);
                if (post instanceof Post) {
                    feed.add((Post)post);
                    if (feed.size() > Constants.FeedThreshold) {
                        feed.poll();
                    }
                }
            }
        }

        return new ArrayList<Entity>(feed);
    }

    public static List<String> getRequest(String userId) {
        Profile profile = SocialMediaRepository.getProfile(userId);
        return profile.getRequests();
    }
}
