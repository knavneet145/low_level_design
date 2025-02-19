package com.lld.MusicStreamingService;

import java.util.*;

public class UserProfile {
    private final String name;
    private final String userId;
    private final Map<String, Set<String>> playlists;

    public UserProfile(String name, String userId) {
        this.name = name;
        this.userId = userId;
        playlists = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public Map<String, Set<String>> getPlaylists() {
        return playlists;
    }

    public void createPlaylist(String name) {
        if (playlists.containsKey(name)) {
            System.out.println("Playlist already exists with this name.");
            return;
        }

        playlists.put(name, new HashSet<>());
    }

    public void addSongsToPlayList(List<String> songs, String playlist) {
        if (!playlists.containsKey(playlist)) {
            createPlaylist(playlist);
        }
        playlists.get(playlist).addAll(songs);
    }

    public void removeSongsFromPlaylist(List<String> songs, String playlist) {
        if (!playlists.containsKey(playlist)) return;
        songs.forEach(playlists.get(playlist)::remove);
    }
}
