package com.example.demo.service;

import com.example.demo.model.Song;
import com.example.demo.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServicesImpl implements ISongServices{

    @Autowired
    private ISongRepository iSongRepository;
    @Override
    public List<Song> showListSong() {
        return iSongRepository.showListSong();
    }

    @Override
    public void createSong(Song song) {
         iSongRepository.createSong(song);
    }

    @Override
    public void deleteSong(int id){
        iSongRepository.deleteSong(id);
    }

    @Override
    public Song getSongById(int id) {
        return iSongRepository.getSongById(id);
    }

    @Override
    public void updateSong( Song song) {
        iSongRepository.updateSong(song);
    }
}
