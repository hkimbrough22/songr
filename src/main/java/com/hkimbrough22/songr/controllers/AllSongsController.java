package com.hkimbrough22.songr.controllers;

import com.hkimbrough22.songr.models.Album;
import com.hkimbrough22.songr.repositories.AlbumRepository;
import com.hkimbrough22.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllSongsController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @GetMapping("/all-songs")
    public String displayAllSongs(){
        return "all-songs";
    }
}

