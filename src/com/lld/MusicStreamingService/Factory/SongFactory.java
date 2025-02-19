package com.lld.MusicStreamingService.Factory;

import com.lld.MusicStreamingService.DAO;
import com.lld.MusicStreamingService.Song;
import com.lld.MusicStreamingService.SongCategory;

import java.time.Duration;

public class SongFactory {
    private static long id = 0;
    public static Song getInstance(String title, String artist, String album, Duration duration, SongCategory category) {
        Song song = new Song(title, artist, album, duration, String.valueOf(++id), category);
        DAO.addSong(song);
        return song;
    }
}
