package com.lld.MusicStreamingService;

import java.time.Duration;
import java.util.List;

public class MusicStreamingService {
    private final StreamingService service;
    private static MusicStreamingService instance;

    private MusicStreamingService() {
        service = new StreamingService();
    }

    public static MusicStreamingService getInstance() {
        if (instance == null) {
            instance = new MusicStreamingService();
        }
        return instance;
    }

    public void createPlaylist(String userId, String playlistName) {
        UserProfile profile = DAO.getUserProfile(userId);
        profile.createPlaylist(playlistName);
    }

    public void addSongsToPlaylist(String userId, String playlistName, List<String> songs) {
        UserProfile profile = DAO.getUserProfile(userId);
        profile.addSongsToPlayList(songs, playlistName);
    }

    public void removeSongsFromPlaylist(String userId, List<String> songs, String playlistName) {
        UserProfile profile = DAO.getUserProfile(userId);
        profile.removeSongsFromPlaylist(songs, playlistName);
    }

    public void playSong(String songId) {
        service.streamSong(DAO.getSong(songId));
    }

    public void pauseSong(String songId) {
        service.stopStreaming(DAO.getSong(songId));
    }

    public void seekSong(String songId, Duration duration) {
        service.startStreamFrom(DAO.getSong(songId), duration);
    }

    public void displaySearchedResults(String searchWord) {
        DisplayService.displaySearchedResult(searchWord);
    }
}
