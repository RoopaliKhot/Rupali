package com.artistvote.service;

import org.springframework.stereotype.Service;

import com.artistvote.entity.Vote;

@Service
public interface VoteService {

	 Vote voteArtist(Vote vote);
}
