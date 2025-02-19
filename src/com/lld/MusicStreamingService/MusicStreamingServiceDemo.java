package com.lld.MusicStreamingService;

import com.lld.MusicStreamingService.Factory.AlbumFactory;
import com.lld.MusicStreamingService.Factory.ProfileFactory;
import com.lld.MusicStreamingService.Factory.SongFactory;

import java.time.Duration;
import java.util.Arrays;

public class MusicStreamingServiceDemo implements Runnable{

    @Override
    public void run() {
        MusicStreamingService service = MusicStreamingService.getInstance();

        UserProfile navneet = ProfileFactory.getInstance("Navneet");
        service.createPlaylist(navneet.getUserId(), "Workout");

        Song song1 = SongFactory.getInstance("Russian Bandana", "Nyoliwala", "Nyoliwala album", Duration.ofMinutes(4),SongCategory.BOLLYWOOD);
        Song song2 = SongFactory.getInstance("Up to you", "Nyoliwala", "Nyoliwala album", Duration.ofMinutes(3),SongCategory.BOLLYWOOD);

        Album album = AlbumFactory.getInstance("Nyoliwala", "Nyoliwala album", Arrays.asList(song1.getId(), song2.getId()));

        service.addSongsToPlaylist(navneet.getUserId(), "Workout", Arrays.asList(song1.getId(), song2.getId()));
        service.displaySearchedResults("Bandana");
        service.playSong(song1.getId());
        service.pauseSong(song1.getId());
    }
}
