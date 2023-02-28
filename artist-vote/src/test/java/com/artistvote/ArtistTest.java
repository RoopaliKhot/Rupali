/*package com.artistvote;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.BDDMockito.given;

import com.artistvote.api.ArtistVoteSuccessResponse;
import com.artistvote.controller.ArtistController;
import com.artistvote.entity.Artist;
import com.artistvote.entity.Vote;
import com.artistvote.entity.VoteCount;

import static java.util.Collections.singletonList;
import static org.springframework.http.MediaType.APPLICATION_JSON;

public class ArtistTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private ArtistController artistController;

	@Test
	public void getAllArtist() {

		Artist artist = new Artist();
		artist.setArtist_id(1);
		artist.setArtist_name("Rupali");
		artist.setArtist_description("British Rock music pioneers");
		artist.setCreate_date(java.time.LocalDateTime.now().toString());
		artist.setUpdate_date(java.time.LocalDateTime.now().toString());
		
		Vote v = new Vote();
		v.setVote_id(1);
		v.setArtist_id(1);
		v.setCreate_date(java.time.LocalDateTime.now().toString());
		v.setUpdate_date(java.time.LocalDateTime.now().toString());
		
		List<VoteCount> vouteCount = (List<VoteCount>) artistController.fetchAllArtistWithVoteCount();
		
		
		
	}
}
*/