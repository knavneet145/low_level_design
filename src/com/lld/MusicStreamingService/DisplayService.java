package com.lld.MusicStreamingService;

import java.util.List;
import java.util.Map;

public class DisplayService {
    public static void displaySearchedResult(String searchWord) {
        Map<String, List<String>> result = SearchService.search(searchWord);
        System.out.println("Results for songs..");
        for (String songTitle: result.get("songs")) {
            System.out.println("title: "+ songTitle);
        }

        System.out.println("Results for albums..");
        for (String albumTitle: result.get("albums")) {
            System.out.println("Album title: "+ albumTitle);
        }
    }
}
