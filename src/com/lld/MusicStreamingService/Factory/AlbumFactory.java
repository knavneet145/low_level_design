package com.lld.MusicStreamingService.Factory;

import com.lld.MusicStreamingService.Album;
import com.lld.MusicStreamingService.DAO;
import java.util.List;

public class AlbumFactory {
    private static long id = 0;
    public static Album getInstance(String artist, String title, List<String> songs) {
        Album album = new Album(artist,title,String.valueOf(++id),songs);
        DAO.addAlbum(album);
        return album;
    }
}
