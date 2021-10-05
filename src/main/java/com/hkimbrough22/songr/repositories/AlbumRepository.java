package com.hkimbrough22.songr.repositories;

import com.hkimbrough22.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
