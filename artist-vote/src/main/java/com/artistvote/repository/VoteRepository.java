package com.artistvote.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.artistvote.entity.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> {

	/*@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
	+ "FROM Department d LEFT JOIN d.employees e")
List<Artist> fetchAllArtistWitVoteCount();*/
	
	//@Query("SELECT (MAX(v.vote_id)) FROM Vote v WHERE v.artist_id=?1")
	@Query("SELECT (MAX(v.vote_id)) FROM Vote v")
	String fetchMaxVote();
	
	/*@Query("SELECT artist_id,(COUNT(v.vote_id)) FROM Vote v group by artist_id")
	List<Vote> fetchAllArtistWitVoteCount();*/
	
	
}
