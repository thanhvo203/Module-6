package com.example.demo.controller;


import com.example.demo.model.Song;
import com.example.demo.service.ISongServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
@CrossOrigin("*")
public class SongController {
    @Autowired
    private ISongServices iSongServices;

    @GetMapping()
    public ResponseEntity<List<Song>> showListSong() {
        return new ResponseEntity<>(iSongServices.showListSong(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createSong(@RequestBody Song song) {
        iSongServices.createSong(song);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSong(@PathVariable int id) {
        iSongServices.deleteSong(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateSong( @RequestBody Song song) {
        iSongServices.updateSong(song);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
