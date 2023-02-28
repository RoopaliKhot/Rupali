package com.artistvote.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistvote.api.ArtistVoteSuccessResponse;
import com.artistvote.entity.Artist;
import com.artistvote.entity.VoteCount;
import com.artistvote.repository.ArtistRepository;
import com.artistvote.service.ArtistService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ArtistController {

	
	
	@Autowired
	private  ArtistRepository artistRepository;

	@GetMapping("/artist")
	public ResponseEntity<ArtistVoteSuccessResponse> fetchAllArtistWithVoteCount() {
		ArtistVoteSuccessResponse responce = null;
		List<VoteCount> artist = artistRepository.fetchAllArtistWithVoteCount();
		if(artist !=null){
			responce = new ArtistVoteSuccessResponse(HttpStatus.OK, "SUCCESS", artist);
			return new ResponseEntity<>(responce, HttpStatus.OK);
		}else{
			responce = new ArtistVoteSuccessResponse(HttpStatus.OK, "Artist Not Found", artist);
			return new ResponseEntity<>(responce, HttpStatus.OK);
		}
		
	}
	
	
	/*@GetMapping("/artist/{id}")	
	public VoteCount fetchArtistWithVoteCount(@PathVariable int id) {	
	    return artistRepository.fetchArtistWithVoteCount(id);
	
	}*/
	@GetMapping("/artist/{id}")
	public ResponseEntity<ArtistVoteSuccessResponse> fetchArtistWithVoteCount(@PathVariable int id) {
		ArtistVoteSuccessResponse responce = null;
		VoteCount voteCount = artistRepository.fetchArtistWithVoteCount(id);
		if(voteCount !=null){
			responce = new ArtistVoteSuccessResponse(HttpStatus.OK, "SUCCESS", voteCount);
			return new ResponseEntity<>(responce, HttpStatus.OK);
		}else{
			responce = new ArtistVoteSuccessResponse(HttpStatus.OK, "Artist Not Found", voteCount);
			return new ResponseEntity<>(responce, HttpStatus.OK);
		}
		
	
	}	
	
	
}
