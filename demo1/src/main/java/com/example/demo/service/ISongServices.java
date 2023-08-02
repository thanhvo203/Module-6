package com.example.demo.service;

import com.example.demo.model.Song;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ISongServices {
    List<Song> showListSong();

    void createSong (Song song);
    void deleteSong (int id);

    Song getSongById (int id);

    void updateSong( Song song);
}
