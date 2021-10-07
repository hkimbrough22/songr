package com.hkimbrough22.songr.controllers;

import com.hkimbrough22.songr.models.Album;
import com.hkimbrough22.songr.models.Song;
import com.hkimbrough22.songr.repositories.AlbumRepository;
import com.hkimbrough22.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.Entity;
import java.util.List;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @GetMapping("/all-songs")
    public String displayAllSongs(){
        List<Song> allSongs = songRepository.findAll();
        return "all-songs.html";
    }

    @PostMapping("/add-song")
    public RedirectView addSongToAlbum(Model m, String songTitle, int songLength, int trackNumber, String albumName){
        Album album = albumRepository.findByTitle(albumName);
        Song newSong = new Song(songTitle, songLength, trackNumber, album);
        songRepository.save(newSong);
        m.addAttribute("album", album);
//        http://localhost:8080/album?albumTitle=Bananas
        return new RedirectView("/album?albumTitle=" + album.getTitle());
    }
}
