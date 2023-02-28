package com.artistvote.api;

import org.springframework.http.HttpStatus;

public class ArtistVoteResponse {

	private HttpStatus status;

	private String date;

	private String responseMessage;

	public ArtistVoteResponse(HttpStatus status) {
		this.status = status;
	}

	public ArtistVoteResponse(HttpStatus status, String date) {
		this(status);
		this.date = date;
	}

	/*
	 * this is required while deserializing test response to create object
	 */
	public ArtistVoteResponse() {

	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public String getresponseMessage() {
		return responseMessage;
	}

	public void setresponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
