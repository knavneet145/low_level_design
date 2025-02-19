package com.lld.MusicStreamingService;

import java.time.Duration;

public class Song {
    private final String title;
    private final String artist;
    private final String album;
    private final Duration duration;
    private final String id;
    private final SongCategory category;

    public Song(String title, String artist, String album, Duration duration, String id, SongCategory category) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.id = id;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }
}
