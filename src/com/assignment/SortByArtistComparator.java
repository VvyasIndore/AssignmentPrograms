package com.assignment;
import java.util.Comparator;

public class SortByArtistComparator implements Comparator<Song>
{

	@Override
	public int compare(Song song1, Song song2) 
	{
		return song1.getArtist().compareTo(song2.getArtist());  // we can used reversed method in compartoor object to get in desc order sorting
	}
	
	
}
