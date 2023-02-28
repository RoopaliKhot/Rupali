package com.artistvote.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistvote.api.ArtistVoteSuccessResponse;
import com.artistvote.entity.Artist;
import com.artistvote.entity.Vote;
import com.artistvote.repository.ArtistRepository;
import com.artistvote.repository.VoteRepository;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/vote")
public class VoteController {

	@Autowired
	ArtistRepository artistRepository;

	@Autowired
	VoteRepository voteRepository;

	@PostMapping
	public ResponseEntity<ArtistVoteSuccessResponse> voteArtist(@RequestBody Vote vote) {
		ArtistVoteSuccessResponse responce = null;
		Vote v = new Vote();
		Optional<Artist> artist = artistRepository.findById(vote.getArtist_id());
		if (artist.isPresent()) {
			String id = voteRepository.fetchMaxVote();
			//System.out.println("id ****" + id);
			int voteId = id != null ? (Integer.parseInt(id) + 1) : 1;
			v.setVote_id(voteId);
			v.setArtist_id(vote.getArtist_id());
			v.setCreate_date(java.time.LocalDate.now().toString());
			v.setUpdate_date(java.time.LocalDate.now().toString());
		} else {
			responce = new ArtistVoteSuccessResponse(HttpStatus.BAD_REQUEST, "Failed", null);
		}
		Vote voteSave = voteRepository.save(v);
		responce = new ArtistVoteSuccessResponse(HttpStatus.OK, "SUCCESS", voteSave);
		return new ResponseEntity<>(responce, HttpStatus.OK);
	}
	
	
}
