package com.artistvote.api;


import org.springframework.http.HttpStatus;

public class ArtistVoteSuccessResponse extends ArtistVoteResponse {

 /*
  * Response object can be an array of object or single object
  */
 Object responceObject;

 public ArtistVoteSuccessResponse(HttpStatus status) {
  super(status);
  setresponseMessage("Success");
 }

 public ArtistVoteSuccessResponse(HttpStatus status, String message, Object responceObject) {
  super(status, message);
  this.responceObject = responceObject;
  setresponseMessage(message);
  setdate(java.time.LocalDateTime.now().toString());
 }

 public ArtistVoteSuccessResponse(HttpStatus status, Object responceObject) {
  super(status);
  this.setResponceObject(responceObject);
 }

 public Object getResponceObject() {
  return responceObject;
 }

 public void setResponceObject(Object responceObject) {
  this.responceObject = responceObject;
 }

}
