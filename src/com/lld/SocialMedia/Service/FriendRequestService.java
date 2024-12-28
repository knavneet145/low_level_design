package com.lld.SocialMedia.Service;

import com.lld.SocialMedia.Entity.Profile;
import com.lld.SocialMedia.Repository.SocialMediaRepository;

public class FriendRequestService {
    public static void SendFriendRequest(String senderId, String recieverId) {
        Profile recieverProfile = SocialMediaRepository.getProfile(recieverId);
        recieverProfile.addRequest(senderId);
    }
}
