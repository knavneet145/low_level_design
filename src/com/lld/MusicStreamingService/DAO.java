package com.lld.MusicStreamingService;

import java.util.concurrent.ConcurrentHashMap;

public class DAO {
    private static ConcurrentHashMap<String, Song> songs = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Album> albums = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, UserProfile> users = new ConcurrentHashMap<>();

    public static void addUser(UserProfile profile) {
        users.put(profile.getUserId(), profile);
    }

    public static void addAlbum(Album album) {
        albums.put(album.getId(), album);
    }

    public static void addSong(Song song) {
        songs.put(song.getId(), song);
    }

    public static UserProfile getUserProfile(String userId) {
        return users.get(userId);
    }

    public static Album getAlbum(String albumId) {
        return albums.get(albumId);
    }

    public static Song getSong(String songId) {
        return songs.get(songId);
    }

    public static ConcurrentHashMap<String, Song> getSongs() {
        return songs;
    }

    public static ConcurrentHashMap<String, Album> getAlbums() {
        return albums;
    }

    public static ConcurrentHashMap<String, UserProfile> getUsers() {
        return users;
    }
}
