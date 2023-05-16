package com.assignment;
import java.util.Comparator;

public class SortByYearComparator implements Comparator<Song>
{

	@Override
	public int compare(Song song, Song anotherSong) 
	{
		
		// Sort alll the songs by year in asc ord
		if(song.getYear()>anotherSong.getYear())
		{
			return +1;
		}
		if(song.getYear()<anotherSong.getYear())
		{
			return -1;
		}
		return 0;
	}

}
