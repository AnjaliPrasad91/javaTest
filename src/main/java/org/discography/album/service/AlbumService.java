package org.discography.album.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.discography.album.bean.Album;


public class AlbumService {

	static HashMap<Integer,Album> albumIdMap=getAlbumIdMap();


	public AlbumService() {
		super();

		if(albumIdMap==null)
		{
			albumIdMap=new HashMap<Integer,Album>();
			ArrayList<String> tracksOfQueen = new ArrayList<String>();
			tracksOfQueen.add("Innuendo ");
			tracksOfQueen.add("I'm Going Slightly Mad ");
			tracksOfQueen.add("Headlong ");
			tracksOfQueen.add(" I Can't Live With You ");
			tracksOfQueen.add(" Ride The Wild Wind ");
			tracksOfQueen.add("All God's People ");
			tracksOfQueen.add("These Are The Days Of Our Lives ");
			tracksOfQueen.add("Delilah ");
			tracksOfQueen.add("Don't Try So Hard ");
			tracksOfQueen.add("The Hitman ");
			tracksOfQueen.add("Bijou ");
			tracksOfQueen.add("The Show Must Go On ");
			
			
			ArrayList<String> tracksOfMJ = new ArrayList<String>();
			tracksOfMJ.add("Wanna Be Startin' Somethin'");
			tracksOfMJ.add("Baby Be Mine");
			tracksOfMJ.add("The Girl Is Mine");
			tracksOfMJ.add("Thriller");
			tracksOfMJ.add("Beat It");
			tracksOfMJ.add("Billie Jean");
			tracksOfMJ.add("Human Nature");
			tracksOfMJ.add("P.Y.T. (Pretty Young Thing)");
			tracksOfMJ.add("The Lady in My Life");
			
			
			
			ArrayList<String> tracksOfBritney = new ArrayList<String>();
			tracksOfBritney.add("Invitation");
			tracksOfBritney.add("Do You Wanna Come Over?");
			tracksOfBritney.add("Make Me...");
			tracksOfBritney.add("Private Show");
			tracksOfBritney.add("Man on the Moon");
			tracksOfBritney.add("Just Luv Me");
			tracksOfBritney.add("Clumsy");
			tracksOfBritney.add("Slumber Party");
			tracksOfBritney.add("Just like Me");
			tracksOfBritney.add("Love Me Down");
			
			
			ArrayList<String> tracksOfJennifer = new ArrayList<String>();
			tracksOfJennifer.add("Dance Again");
			tracksOfJennifer.add("Goin' In");
			tracksOfJennifer.add("I'm Into You");
			tracksOfJennifer.add("On the Floor");
			tracksOfJennifer.add("Love Don't Cost a Thing");
			tracksOfJennifer.add("If You Had My Love");
			tracksOfJennifer.add("Waiting for Tonight");
			tracksOfJennifer.add("Get Right");
			tracksOfJennifer.add("Jenny from the Block");
			tracksOfJennifer.add("I'm Real");
			tracksOfJennifer.add("Do It Well");
			
			
			Album queen=new Album(1, "Queen","Innuendo",1991,tracksOfQueen);
			Album mj=new Album(2, "Michael Jackson","Thriller",1982,tracksOfMJ);
			Album britney=new Album(3, "Britney Spears","Glory",2016,tracksOfBritney);
			Album jennifer=new Album(4, "Jennifer Lopez","Dance Again... the Hits",1994,tracksOfJennifer);


			albumIdMap.put(1,queen);
			albumIdMap.put(4,jennifer);
			albumIdMap.put(3,britney);
			albumIdMap.put(2,mj);
		}
	}

	public List<Album> getAllAlbums()
	{
		List<Album> albums = new ArrayList<Album>(albumIdMap.values());
		return albums;
	}

	public Album getAlbum(int id)
	{
		Album album= albumIdMap.get(id);
		return album;
	}
	public Album addAlbum(Album album)
	{
		album.setId(albumIdMap.size()+1);
		albumIdMap.put(album.getId(), album);
		return album;
	}
	
	public Album updateAlbum(Album album)
	{
		if(album.getId()<=0)
			return null;
		albumIdMap.put(album.getId(), album);
		return album;

	}
	public void deleteAlbum(int id)
	{
		albumIdMap.remove(id);
	}

	public static HashMap<Integer, Album> getAlbumIdMap() {
		return albumIdMap;
	}


}
