package com.artistvote.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.artistvote.entity.Artist;
import com.artistvote.entity.VoteCount;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
	
		
	@Query("SELECT new com.artistvote.entity.VoteCount(v.artist_id,COUNT(v.vote_id))"+" FROM Vote v group by v.artist_id")
	List<VoteCount> fetchAllArtistWithVoteCount();
	
	@Query("SELECT new com.artistvote.entity.VoteCount(v.artist_id,COUNT(v.vote_id))"+" FROM Vote v WHERE v.artist_id=?1 group by v.artist_id")
	VoteCount fetchArtistWithVoteCount(int artist_id);
}
