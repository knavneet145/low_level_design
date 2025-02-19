package com.lld.MusicStreamingService;

import java.time.Duration;

public class StreamingService {
    public void streamSong(Song song) {
        System.out.println("streaming has been started for song "+ song.getTitle());
    }

    public void stopStreaming(Song song) {
        System.out.println("Streaming has been stopped for "+song.getTitle());
    }

    public void startStreamFrom(Song song, Duration duration) {
        System.out.println("Started streaming after duration "+duration.toNanos());
    }
}
