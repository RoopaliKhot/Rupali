package com.artistvote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.artistvote.entity.Artist;
import com.artistvote.entity.Vote;
import com.artistvote.repository.ArtistRepository;
import com.artistvote.service.VoteService;

public class VoteServiceImpl implements VoteService{

	@Autowired
	ArtistRepository artistRepository;
	
	@Override
	public Vote voteArtist(Vote vote) {		
		Vote v = new Vote();
		Artist artist = artistRepository.getById(vote.getArtist_id());
		if(artist != null){
			v.setArtist_id(vote.getArtist_id());
			v.setCreate_date(java.time.LocalDate.now().toString());
			v.setUpdate_date(java.time.LocalDate.now().toString());
		}
		else{
			return null;
		}
		return v;
	}

}
