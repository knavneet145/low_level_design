package com.lld.MusicStreamingService;

import java.util.List;

public class Album {
    private final String artist;
    private final String title;
    private final String id;
    private final List<String> songs;

    public Album(String artist, String title, String id, List<String> songs) {
        this.artist = artist;
        this.title = title;
        this.id = id;
        this.songs = songs;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public List<String> getSongs() {
        return songs;
    }
}
