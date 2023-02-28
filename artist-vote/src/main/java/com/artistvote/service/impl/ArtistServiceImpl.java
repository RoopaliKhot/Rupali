package com.artistvote.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.artistvote.entity.Artist;
import com.artistvote.repository.ArtistRepository;
import com.artistvote.service.ArtistService;

public class ArtistServiceImpl implements ArtistService{

	@Autowired
	private ArtistRepository artistRepository;
	
	
	
	public List<Artist> getAllArtist() {
		return artistRepository.findAll();
	}

	public Optional<Artist> findById(int id){
		return artistRepository.findById(id);
	}

	
	
}
