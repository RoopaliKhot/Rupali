package com.artistvote.entity;

import javax.persistence.Entity;


public class VoteCount {

	private int artist_id;
	
	private long vote_count;

	public VoteCount(int artist_id, long vote_count) {
		super();
		this.artist_id = artist_id;
		this.vote_count = vote_count;
	}

	public int getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}

	public long getVote_count() {
		return vote_count;
	}

	public void setVote_count(long vote_count) {
		this.vote_count = vote_count;
	}

	
}
