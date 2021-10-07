package com.hkimbrough22.songr.repositories;

import com.hkimbrough22.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
