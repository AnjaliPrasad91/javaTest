package org.discography.album.bean;

import java.util.ArrayList;

public class Album{
	
	int id;
	String artist;	
	String album;
	int year;
	ArrayList<String> tracks = new ArrayList<String>();
	public Album() {
		super();
	}
	public Album(int i, String artist,String album,int year,ArrayList<String> tracks) {
		super();
		this.id = i;
		this.artist = artist;
		this.album=album;
		this.year=year;
		this.tracks=tracks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public ArrayList<String> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<String> tracks) {
		this.tracks = tracks;
	}
	
	
}