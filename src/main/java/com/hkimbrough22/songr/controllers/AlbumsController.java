package com.hkimbrough22.songr.controllers;

import com.hkimbrough22.songr.models.Album;
import com.hkimbrough22.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumsController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String generateAlbums(Model album) {
        List<Album> albums = albumRepository.findAll();
        album.addAttribute("albums", albums);
//        albumRepository.saveAll(albums);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView createAlbum(String title, String artist, int songCount, int length, String imgUrl){
        Album newAlbum = new Album(title, artist, songCount, length, imgUrl);
        albumRepository.save(newAlbum);

        return new RedirectView("/albums");
    }
}
