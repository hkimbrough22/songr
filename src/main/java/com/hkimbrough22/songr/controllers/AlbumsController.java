package com.hkimbrough22.songr.controllers;

import com.hkimbrough22.songr.models.Album;
import com.hkimbrough22.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumsController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String generateAlbums(Model album) {
        ArrayList<Album> albums = new ArrayList<>();
        Album album1 = new Album("HellerWorld", "Jean-Claude", 12, 900, "test");
        Album album2 = new Album("HolaWorld", "Me", 10, 980, "test");
        Album album3 = new Album("Hellow World", "You", 11, 9000, "test");
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        album.addAttribute("albums", albums);
        albumRepository.save(album1);
        return "albums";
    }
}
