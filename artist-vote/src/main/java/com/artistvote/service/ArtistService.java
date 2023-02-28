package com.artistvote.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.artistvote.entity.Artist;

import lombok.AllArgsConstructor;

@Service
//@AllArgsConstructor
public interface ArtistService {

	 List<Artist> getAllArtist();

	Optional<Artist> findById(int id);
}
