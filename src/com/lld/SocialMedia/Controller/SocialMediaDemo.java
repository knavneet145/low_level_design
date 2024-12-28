package com.lld.SocialMedia.Controller;

import com.lld.SocialMedia.Constants.PostVisibility;
import com.lld.SocialMedia.Entity.Entity;
import com.lld.SocialMedia.Entity.Post;
import com.lld.SocialMedia.Entity.Profile;
import com.lld.SocialMedia.Factory.PostFactory;
import com.lld.SocialMedia.Factory.ProfileFactory;
import com.lld.SocialMedia.Factory.UserFactory;
import com.lld.SocialMedia.Service.PostService;
import com.lld.SocialMedia.Service.SocialMediaService;
import com.lld.SocialMedia.Entity.User;

import java.util.List;

public class SocialMediaDemo implements Runnable {
    public void run() {
        User jay = UserFactory.getUser("Jay", "jay1997@gmail.com","jay123");
        User viru = UserFactory.getUser("Viru", "viru1997@gmail.com", "viru123");
        Profile jayProfile = ProfileFactory.getProfile("aws.services.jayprofile","Not a complain boy", "Hunt for gabbar",jay.getId());
        Profile viruProfile = ProfileFactory.getProfile("aws.services.viruprofile","I love basanti","pluck mangoes", viru.getId());
        Post jayPost = PostFactory.getPost("I have caught gabbar today", "aws.cloud.jaypost1",jay.getId(), PostVisibility.FRIENDS);
        PostService.createPost(jay.getId(), jayPost);
        SocialMediaService.sendFriendRequest(jay.getId(), viru.getId());
        List<String> requests = SocialMediaService.getRequest(viru.getId());
        for (String request: requests) {
            SocialMediaService.acceptRequest(request, viru.getId());
        }

        List<Entity> posts = SocialMediaService.getNewsFeed(viru.getId());
        for (Entity entity: posts) {
            System.out.println(((Post)entity).getText());
        }
    }
}
