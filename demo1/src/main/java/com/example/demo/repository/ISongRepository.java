package com.example.demo.repository;

import com.example.demo.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface ISongRepository extends JpaRepository<Song, Integer> {
    @Query (value = "select * from song" , nativeQuery = true)
    List<Song> showListSong();

    @Modifying
    @Query(nativeQuery = true, value = "insert into song (name,singer,time, favioste,song_state) " +
            "values (:#{#song.name}, :#{#song.singer},:#{#song.time},:#{#song.favioste},:#{#song.songState});")
    void createSong(@Param("song") Song song);

    @Modifying
    @Query(nativeQuery = true, value = "delete from song where id = :id")
    void deleteSong(@Param("id") int id);

    @Modifying
    @Query(value = "SELECT * FROM song s WHERE s.id = :id", nativeQuery = true)
    Song getSongById(@Param("id") int id);
    @Modifying
    @Query(value = "update song set `name`=:#{#song.name}, singer=:#{#song.singer},time=:#{#song.time}, favioste=:#{#song.favioste}, song_state=:#{#song.songState} " +
            "where id = :id ", nativeQuery = true)
    void updateSong(@Param("song") Song song);
}
