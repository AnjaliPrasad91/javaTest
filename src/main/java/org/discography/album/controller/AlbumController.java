package org.discography.album.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.discography.album.bean.Album;
import org.discography.album.service.AlbumService;


@Path("/albums")
public class AlbumController {
	
	AlbumService albumService=new AlbumService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Album> getAlbums()
	{
		
		List<Album> listOfAlbums=albumService.getAllAlbums();
		return listOfAlbums;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Album getAlbumById(@PathParam("id") int id)
	{
		return albumService.getAlbum(id);
	}
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	public Album addAlbum(Album album)
	{
		return albumService.addAlbum(album);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public Album updateAlbum(Album album)
	{
		return albumService.updateAlbum(album);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteAlbum(@PathParam("id") int id)
	{
    	albumService.deleteAlbum(id);
		
	}
	
}
