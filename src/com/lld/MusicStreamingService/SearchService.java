package com.lld.MusicStreamingService;

import java.util.*;
import java.util.stream.Collectors;

public class SearchService {
    public static Map<String, List<String>> search(String searchWord) {
        Map<String, List<String>> result = new HashMap<>();
        result.put("songs", getSearchedSongs(searchWord));
        result.put("albums", getSearchedAlbums(searchWord));
        return result;
    }

    private static List<String> getSearchedSongs(String searchWord) {
        return DAO.getSongs().values().stream()
                .map(Song::getTitle)
                .filter(title -> title.contains(searchWord))
                .collect(Collectors.toList());
    }

    private static List<String> getSearchedAlbums(String searchWord) {
        return DAO.getAlbums().values().stream()
                .map(Album::getTitle)
                .filter(title -> title.contains(searchWord))
                .collect(Collectors.toList());
    }
}
