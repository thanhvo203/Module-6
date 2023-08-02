package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String singer;
    private String time;
    private int favioste;
    private String songState;

    public Song() {
    }

    public Song(int id, String name, String singer, String time, int favioste, String songState) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.time = time;
        this.favioste = favioste;
        this.songState = songState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFavioste() {
        return favioste;
    }

    public void setFavioste(int favioste) {
        this.favioste = favioste;
    }

    public String getSongState() {
        return songState;
    }

    public void setSongState(String songState) {
        this.songState = songState;
    }
}
